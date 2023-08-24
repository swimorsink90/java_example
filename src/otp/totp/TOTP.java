package otp.totp;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class TOTP {
	
	private static final long DISTANCE = 60000; // 60 sec
	private static final String ALGORITHM = "HmacSHA1";

	public String otpCreate(String key) throws NoSuchAlgorithmException, InvalidKeyException {
		
		/**
		 * interval
		 * 같은값 : 0
		 * 60초 전 : -60000
		 * 60초후 : 60000
		 */
		long interval = 0;
		
		//TOTP는 HOTP에서 Counter 값을 시간에 의한 값(Time Stamp)로 대체
		//시간값 계산 시, 사용한 DISTANCE(보통 30초 혹은 60초 주기)값에 따라, OTP 코드 값이 변경됨
		long value = (new Date().getTime()+interval) / DISTANCE;
		byte[] data = new byte[8];		
		for (int i = 8; i-- > 0; value >>>= 8) {
			data[i] = (byte) value;
		}
		
		// 위에서 생성한 시간값 data[]와 key를 사용하여
		// HMAC 알고리즘을 통해 Hash값 생성
		Mac mac = Mac.getInstance(ALGORITHM);
		mac.init(new SecretKeySpec(key.getBytes(), ALGORITHM));
	 
		byte[] hash = mac.doFinal(data);
		int offset = hash[20 - 1] & 0xF;
	 
		
		//truncate 과정을 통해 숫자 6자리 생성
		long truncatedHash = 0;
		for (int i = 0; i < 4; ++i) {
			truncatedHash <<= 8;
			truncatedHash |= hash[offset + i] & 0xFF;
		}
	 
		truncatedHash &= 0x7FFFFFFF;
		truncatedHash %= 1000000;
		
		String hashStr = Long.toString(truncatedHash);
		
		//생성된 OTP 값이 6자리 미만일 경우 예외처리
		int digitDiff = 6-hashStr.length();
		if(digitDiff > 0){
			for(int i=0; i<digitDiff; i++) {
				hashStr = "0" + hashStr;
			}
		}		
		return hashStr;
	}


}

package otp.totp;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class TOTPExample {
	
	public static void main(String [ ] args) throws InvalidKeyException, NoSuchAlgorithmException {
		
		TOTP totp = new TOTP();
		String result = totp.otpCreate("test");
		System.out.println("########## OTP reult : "+result);
	}

}

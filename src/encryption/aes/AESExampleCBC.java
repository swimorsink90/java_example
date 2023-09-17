package encryption.aes;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESExampleCBC {
	
	private static final String AES_ALGORITHM = "AES";
	private static final String AES_TRANSFORMATION = "AES/CBC/PKCS5Padding";
	
	public static String encrypt (String key, String initVector, String plainText) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), AES_ALGORITHM);
		IvParameterSpec iv = new IvParameterSpec(initVector.getBytes());
		
		Cipher cipher = Cipher.getInstance(AES_TRANSFORMATION);
		cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
		byte [] encryptedBytes = cipher.doFinal(plainText.getBytes());
		
		return Base64.getEncoder().encodeToString(encryptedBytes);
				
	}
	
	public static String decrypt (String key, String initVector, String encryptedText) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), AES_ALGORITHM);
		IvParameterSpec iv = new IvParameterSpec(initVector.getBytes());
		
		Cipher cipher = Cipher.getInstance(AES_TRANSFORMATION);
		cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);
		
		byte [] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
		
		return new String(decryptedBytes);
	}
	
	public static void main(String [] args) {
		try {
			String key = "ThisIsA128BitKey"; //128비트 (16바이트) 키
			String initVector = "InitializationVe"; //16바이트 초기화 벡터
			
			String originalText = "Hello, AES-128 with CBC";
			System.out.println("original Text : "+originalText);
			
			String encryptedText = encrypt(key, initVector, originalText);
			System.out.println("Encrypted text : "+encryptedText);
			
			String decryptedText = decrypt(key, initVector, encryptedText);
			System.out.println("Decrypted Text : "+decryptedText);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package encryption.hex;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class HexExample {
	
	public static void main(String[] args) throws UnsupportedEncodingException, DecoderException {

		String originalText = "Hello, Hex ENcoding and Decoding Example";
		System.out.println("original Text : "+originalText);
		
		//Hex 인코딩
		String encodedHex = encodeToHex(originalText);
		System.out.println("Encoded Hex : "+encodedHex);
		
		//Hex 디코딩
		String decodedText = decodeFromHex(encodedHex);
		System.out.println("Decoded Text : "+decodedText);
	}
	
	public static String encodeToHex(String text) {
		byte [] bytes = text.getBytes();
		return Hex.encodeHexString(bytes);
	}
	
	public static String decodeFromHex(String hexString) throws DecoderException, UnsupportedEncodingException {
		
		byte [] bytes = Hex.decodeHex(hexString);
		return new String(bytes, "UTF-8");
	}

}

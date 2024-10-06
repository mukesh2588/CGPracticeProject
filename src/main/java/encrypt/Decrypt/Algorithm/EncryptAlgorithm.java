package encrypt.Decrypt.Algorithm;

import java.util.Base64;

public class EncryptAlgorithm {
	
	// put Encryption logic outside of Framework or project where decrypt is being consumed
	public static void encrypt_data(String data) {
		byte[] encodedBytes=Base64.getEncoder().encode(data.getBytes());
		System.out.println(new String(encodedBytes));
	}
	
	public static String decrypt_data(String encryptData)
	{
		byte[] decodedBytes=Base64.getDecoder().decode(encryptData.getBytes());
		
		String res=new String(decodedBytes);
		
		return res;
	}
	
	public static void main(String[] args) {
		encrypt_data("Online_User");
		
// string that you are trying to transform contains a character not recognized by the basic Base 64 Alphabet
// in that case we will get error: “Illegal base64 character 5f"
// e.g. if we pass underscore symbol , _  we will get error error: “Illegal base64 character 5f" 		
		String data=decrypt_data("T25saW5lX1VzZXI=");
		
		System.out.println(data);
	}

}

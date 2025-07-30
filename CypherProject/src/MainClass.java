import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class MainClass {
	public static void main(String[] args) throws Exception {
		String texto = "Hello World!";
		System.out.println("Criptografando...");
		
		KeyGenerator keygen = KeyGenerator.getInstance("AES");
		keygen.init(128);
		SecretKey secretKey = keygen.generateKey();
		//System.out.println("Chave: "+secretKey);
		
		String textoCriptografado = criptografar(texto, secretKey);
		System.out.println("Texto Criptografado: "+textoCriptografado);
		
		String textoDescriptografado = descriptografar(textoCriptografado, secretKey);
		System.out.println("Texto Descriptografado: "+textoDescriptografado);
	}
	
	public static String criptografar(String textoOriginal, SecretKey chave) throws Exception{
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, chave);
		byte[] textoByte = cipher.doFinal(textoOriginal.getBytes());
		return Base64.getEncoder().encodeToString(textoByte);
	}
	
	public static String descriptografar(String textoCripto, SecretKey chave) throws Exception {
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, chave);
		byte[] criptoByte = Base64.getDecoder().decode(textoCripto.getBytes());
		byte[] textoByte = cipher.doFinal(criptoByte);
		return new String(textoByte);
	}
}

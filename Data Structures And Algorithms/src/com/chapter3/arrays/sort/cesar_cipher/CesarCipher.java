package com.chapter3.arrays.sort.cesar_cipher;

public class CesarCipher {

	private char[] encoder = new char[26];
	private char[] decoder = new char[26];
	
	public CesarCipher(int rotation) {
		for(int k = 0 ; k < 26 ; k++) {
			encoder[k] = (char) ('A' + (k + rotation) % 26);
			decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
		}
	}
	
	public String encrypt(String msg) {
		return transform(msg, encoder);
	}
	
	public String decrypt(String msg) {
		return transform(msg, decoder);
	}
	
	private String transform (String original, char[] code) {
		char[] msg= original.toCharArray();
		
		for(int k = 0 ; k < msg.length ; k++) {
			if(Character.isUpperCase(msg[k])) {
				int i = msg[k] - 'A';
				msg[k] = code[i];	
			}
		}
		return new String(msg);
	}
	
	public static void main(String[] args) {
		CesarCipher c = new CesarCipher(3);
		System.out.println(c.encrypt("HELLO WORLD"));
		System.out.println(c.decrypt("HELLO WORLD"));
	}
}

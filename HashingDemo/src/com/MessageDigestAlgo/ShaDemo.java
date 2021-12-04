package com.MessageDigestAlgo;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ShaDemo {
	
	 public static String bytesToHex(byte[] encodedhash) {
	        StringBuilder sb = new StringBuilder();
	        for (byte b : encodedhash) {
	            sb.append(String.format("%02x", b));
	        }
	        return sb.toString();
	    }
public ShaDemo() {}
	public static void main(String[] args) throws NoSuchAlgorithmException 
	{
	
		MessageDigest digest = MessageDigest.getInstance("MD2");
		String originalString = "o";
		byte[] encodedhash = digest.digest( originalString.getBytes(StandardCharsets.US_ASCII));
		
		System.out.println(ShaDemo.bytesToHex(encodedhash));
		
		
for (int i = 0; i < encodedhash.length; i++) {
	
	
}
		
}
}
package com.practice.utilities;

import java.lang.StringBuilder;


public class StringMethods {

	public static String stringRandomizer(int length, String charType){
		String chars;
		if(charType == "numeric"){
			chars = "1234567890";
		}else if(charType == "alphabetic"){
			chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		}else if(charType == "alphanumericCase"){
			chars = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		}else{
			chars = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		}
		StringBuilder randomString = new StringBuilder(length);
		int i;
		for (i = 0; i < length; i++){
			int index = (int)(chars.length() * Math.random());
			randomString.append(chars.charAt(index));
		}
		return randomString.toString();

	}
}

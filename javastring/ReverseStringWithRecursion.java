package com.test.javastring;

public class ReverseStringWithRecursion {

	public static void main(String[] args) {
	
	String s = "Synechron";
	System.out.println("Reversed Sreing of s is: " + reverseString(s));
	
	}

	private static String reverseString(String s1) {
		if(null == s1 || s1.length()<=1) {
		return s1;
		}
		return reverseString(s1.substring(1)) + s1.charAt(0);
	}
}
	

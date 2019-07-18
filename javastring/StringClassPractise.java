package com.test.javastring;

public class StringClassPractise {
	
	String a = "Washington";
	String b = new String("Washington");
	
	
	public static void main(String[] args) {
		StringClassPractise s = new StringClassPractise();
		System.out.println(s.a.hashCode());
		System.out.println(s.b.hashCode());
		int i = 455;
		String a = String.valueOf(i);	
		System.out.println(a);
		a = a + "D.C";
		System.out.println(s.a.hashCode());
        
	}

}

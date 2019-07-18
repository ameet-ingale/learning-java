package com.test.javastring;


import java.util.Arrays;
import java.util.Collection;

public class JavaPractise1 {

	public static void main(String[] args) {
		String A = new String("Venugopal");
		String B = A;
		System.out.println(A==B);
		System.out.println(A.equals(B));
		
		/*String str = "Ameet";
		String str1 = str;
		System.out.println(str==str1);
		System.out.println(str.equals(str1));*/
		
		String str3 = "India";
		String str4 = new String(str3);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		String str5 = new String("Mumbai");
		String str6 = str5;
		System.out.println(str5==str6);
		System.out.println(str5.equals(str6));
        
		A = A +"mitul";
         
		System.out.println("A is " + A);
		System.out.println("B is " + B);

		StringBuffer SA = new StringBuffer("Venugopal");
		StringBuffer SB = SA;

		SA.append("mitul");
		
		System.out.println("SA is " + SA);
		System.out.println("SB is " + SB);
		/*System.out.println(str);
		System.out.println(str1);
		
		String S2 = new String("test");
		
		S2.intern();
		String S1 = "test";
		System.out.println(S1==S2);
		
		System.out.println(S1.equals(S2));
		
		String S3 = null;
		System.out.println(S3.length());*/
		
		String S7 = "Synechron is located in Hinjewadi Phase-3";
		String S8 = "LocateD";		
		String S9 = S7;
        
		String[] numArray = S7.split(" ");
		 
		String ss = Arrays.toString(numArray);
		System.out.println(ss);
		
		System.out.println(S7.regionMatches(true, 10, "IS", 0, 2));
		/*System.out.println(S7.regionMatches(13, S8, 0, 7));
		String sa = new String();
		System.out.println(sa.length());
		
		String ss1 = "Name";
		ss1 = "mention";
		System.out.println(ss1 instanceof String);
		System.out.println();
		System.out.println(ss1 instanceof Object);*/
		
	}
}

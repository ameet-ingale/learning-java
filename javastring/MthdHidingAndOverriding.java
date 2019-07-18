package com.test.javastring;

public class MthdHidingAndOverriding {
	
	static void methodOne() {
		System.out.println("Methos from Parent class");
	}
	
	int multiplication(int a, int b) {
		int c =a*b;
		System.out.println("Multiplication method of Parent class");
		return c;		
	}
}

class ChildImplement extends MthdHidingAndOverriding{
	
	static void methodOne() {
		System.out.println("Method in the child class");
	}
	
	int multiplication(int a, int b) {
		int d=a*b;
		return d;
	}
	public static void main(String[] args) {
		MthdHidingAndOverriding mthd = new ChildImplement();
		mthd.methodOne();
		mthd.multiplication(10, 20);
		
		

	}

}

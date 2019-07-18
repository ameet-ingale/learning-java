package com.test.javastring;

class Parent {
	int value = 1000;
	protected void method1() {
		System.out.println("Parent method is initiated");
	}
}

class Child extends Parent {
	int value = 10;
	void method2() {
		System.out.println("Child method is initiated");
	}
}

// Driver class
class TypeCasting {
	public static void main(String[] args) {
		Parent cobj = new Child();
		Parent par = cobj;

		if (par instanceof Parent) {			
			System.out.println(par.value);
		}
		par.method1();
		cobj.method1();
		((Child)par).method2();
		((Child)cobj).method2();
			
	}
}

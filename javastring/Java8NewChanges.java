package com.test.javastring;

 interface Interface1 {
	 int a = 10;
     int b = 25;
	static void display() {
		System.out.println("hello");
  }
}

class Java8NewChanges implements Interface1 {
	int a =20;
	static Java8NewChanges j8 = new Java8NewChanges();
		public static void main(String[] args) {
			
			Interface1.display();
			
			System.out.println(j8.a);
			System.out.println(Interface1.b);
			System.out.println(j8.b);
			
			String s1 = "Ameet Ingale";
			byte[] b1 = s1.getBytes();
			for(int i=0;i<b1.length;i++) {
			System.out.println(b1[i]);
				}
			
			int series[] = { 65, 66, 67, 68};
		    String s = new String(series, 1, 3);
		    System.out.println(s);
		    
		    int num = 900;
		    System.out.println(String.valueOf(num) + 821);
		    
		    char[] ch = s1.toCharArray();
		    int j = ch.length;
		    for(int i= j-1;i>=0;i--) {
		    	System.out.print(ch[i]);
		    }
		    System.out.println("\n");
		    String acb = "How to do in Java";
		    System.out.println(acb.codePointAt(14));
		    System.out.println(acb.replace("o", "k"));
		    System.out.println(acb.replaceAll("o", "j"));
		        
	}
	
}

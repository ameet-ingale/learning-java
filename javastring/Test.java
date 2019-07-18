package com.test.javastring;

  class Test {

	/*public static void main(String[] args) {
		foo(null);

		long longWithL = 1000 * 60 * 60 * 24 * 365L;
		long longWithoutL = 1000 * 60 * 60 * 24 * 365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
		
        String s1 = "New York";
        System.out.println(s1.hashCode());
        String s2 = new String("New York");
        s2.intern();
        System.out.println(s2.hashCode());
        //decToBinary(6);
        
	}

	public static void foo(Object o) {
		System.out.println("Object impl");
	}

	public static void foo(String s) {
		System.out.println("String impl");
	}
	
	 static void decToBinary(long n) { 
		 
		 long[] binaryNum = new long[1000]; 
	   	       
	        int i = 0; 
	        while (n > 0)  
	        { 
	            binaryNum[i] = n % 2; 
	            n = n / 2; 
	            i++; 
	        } 
	   
	        // printing binary array in reverse order 
	        for (int j = i - 1; j >= 0; j--) 
	            System.out.print(binaryNum[j]); 
		
	    } */
		private static class Inner {
	       public static void main(String[] args) {
	            System.out.println("Hello from Inner!");
	        }
	    }
}

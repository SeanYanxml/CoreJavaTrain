package com.us.demo.exercise;

import java.math.BigDecimal;

// http://www.importnew.com/23160.html
public class Trap01 {
	public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 2;

	public static void main(String []args){
		//Tips1 Think about the negative numbers.
		int number=-1;
		System.out.println(number%2);
		
		//Test2 Be careful of the computing of the floating numbers.
		System.out.println(0.05+0.01);
		System.out.println(1.0-0.42);
		System.out.println(4.015*100);
		System.out.println(123.3/100);
		// Solution 
//		if((0.05+0.01-0.06)==0){System.out.println("Float Yes");}
		if ((0.05+0.01-0.06)<1e-10){System.out.println("Approximately Float Yes");}
		//Solution2
		//System.out.println(new BigDecimal(5.0).subtract(new BigDecimal(4.9)));
		//Error?
//		System.out.println((new BigDecimal(5.0)).subtract(new BigDecimal(4.9)).doubleValue());
		//Final
		System.out.println((new BigDecimal("5.0")).subtract(new BigDecimal("4.9")).doubleValue());
		//System.out.println((new BigDecimal("5.0")).subtract(new BigDecimal("4.9")).doubleValue());
		
		
		//Test3 Be careful of the boundary of the data type.
	    int count = 0;
//	    // Error
////	    for (int i = START; i <=END; i++){
////	         count++;
////	         System.out.println(count);
////	    }
//	    // Final
	    count = 0;
	    for (int i = START; i < END; i++){
	         count++;
	         System.out.println(count);
	    }
		
		//Test4 Be careful of the Try---Finally
		if (decision()){
			 System.out.println("True");
		    } else { 
		     System.out.println("False");
		    } 

	}
	public static boolean decision() {
		try {
			return true;
		} finally {
			return false;
		}
	}

}

package com.us.demo.exception;

public class ExceptionTest {
	public static int divide(int firstNumber, int secondNumber){
		int result = 0;
		try{
			result =  firstNumber / secondNumber;
		}catch(ArithmeticException ex){
			System.out.println("Sorry,error in divide.");
			ex.printStackTrace();
		}
		return result; 
	}
	public static void main(String []args){
		divide(1,2);
		divide(1,0);
		divide(1,2);
		divide(1,2);
	}

}

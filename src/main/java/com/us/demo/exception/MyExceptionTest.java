package com.us.demo.exception;

public class MyExceptionTest{
	public static void addUser() throws MyException{
        System.out.println("添加用户");
	}
	public static void main(String []args){
		addUser();// it is ok
		try{
			addUser();// it is ok
		}catch(MyException myEx){
			myEx.printStackTrace();
		}
	} 
}

class MyException extends RuntimeException{
	public MyException(){
		
	}
	public MyException(String message){
		super(message);
	}
	
}

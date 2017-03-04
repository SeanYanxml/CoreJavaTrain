package com.us.demo.exception;

public class AssertTest {
	public static void judge(int x){
		assert x >= 0 : true;
	}
	public static void main(String []args){
		judge(1);
		judge(-2);
//		//Exception in thread "main" java.lang.AssertionError
//		at com.us.demo.exception.AssertTest.judge(AssertTest.java:5)
//		at com.us.demo.exception.AssertTest.main(AssertTest.java:9)
	}
}


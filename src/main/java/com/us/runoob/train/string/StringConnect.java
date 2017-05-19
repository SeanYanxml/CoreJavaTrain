package com.us.runoob.train.string;

/**
 * Java 实例 - 连接字符串 
 * 以下实例演示了通过 "+" 操作符和StringBuffer.append() 方法来连接字符串，并比较其性能：
 * */
public class StringConnect {
	public static void main(String []args){
		long startTimeAdd = System.currentTimeMillis();
		for(int i=1;i<50000;i++){
			String str="a"+"b"+"c"+"d";
		}
		long endTimeAdd = System.currentTimeMillis();
		System.out.println("Add Time :"+ (endTimeAdd-startTimeAdd) +" ms");
		
		long startTimeAppend = System.currentTimeMillis();
		for(int i=1;i<50000;i++){
			StringBuffer strBuffer = new StringBuffer();
			strBuffer.append("a");
			strBuffer.append("b");
			strBuffer.append("c");
			strBuffer.append("d");
		}
		long endTimeAppend = System.currentTimeMillis();
		System.out.println("Append Time :"+ (endTimeAppend-startTimeAppend)+" ms" );
	}

	/**
	 * Add Time :1 ms
	 * Append Time :14 ms
	 * */
}

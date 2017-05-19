package com.us.runoob.train.string;

/**
 * Java 实例 - 字符串性能比较测试 
 * 以下实例演示了通过两种方式创建字符串，并测试其性能：
 * */
public class StringComparePerformance {
	public static void main(String []args){
		long startTimeStr = System.currentTimeMillis();
		for(int i=1;i<50000;i++){
			String str="12345";
		}
		long endTimeStr = System.currentTimeMillis();
		System.out.println("Constance Str Time :"+ (endTimeStr-startTimeStr) +" ms");
		
		long startTimeString = System.currentTimeMillis();
		for(int i=1;i<50000;i++){
			String string = new String("23444455");
		}
		long endTimeString = System.currentTimeMillis();
		System.out.println("String Object Time :"+ (endTimeString-startTimeString)+" ms" );
	}

	/**
	 * Constance Str Time :1 ms
	 * String Object Time :3 ms
	 * */
}

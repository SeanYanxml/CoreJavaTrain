package com.us.runoob.train.string;

/**
 * Java 实例 - 字符串比较
 * 
 * 以下实例中我们通过字符串函数 
 * compareTo (string) ，
 * compareToIgnoreCase(String) 
 * 及 compareTo(object string) 来比较两个字符串，
 * 并返回字符串中第一个字母ASCII的差值。
 */

public class StringCompare {
	public static void main(String []args){
		String str1 = "Hello World !";// H 72 W 87
		String str2 = "hello World !";// h 104
		String str3 = "Hello Sean";// S 83
		String str5 = "隔壁老王";//隔 Unicode 编码 &#38548;

		
		Object str4 = str1;
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareTo(str4.toString()));
		
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str5));

		/*
		 * 输出结果:(以一个不相同的字符的ASCII码进行计算，貌似中文的字符是按照 UTF-8 进行的计算)
		 * 
		 * 
		 * -32 （72-104）
		 *  0   (0)
		 *  0   (0)
		 *  4   (W-S)(87-83)
		 *  -38476 (H-隔) (72-38548)
		 */
		
		// 还有一个经常使用的函数 .equals() 方法 用来判断字符串是否都是相等的
	}

}

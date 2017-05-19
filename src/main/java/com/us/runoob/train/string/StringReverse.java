package com.us.runoob.train.string;

/**
 * Java 实例 - 字符串反转
 * Java 实例 Java 实例
 * 以下实例演示了如何使用 Java 的反转函数 reverse() 将字符串反转：
 * */

public class StringReverse {
	public static void main(String []args){
		String str = "runoob";
		StringBuffer reverse = new StringBuffer(str);
		String reverseStr = reverse.reverse().toString();
		System.out.println("字符串反转前:"+str);
		System.out.println("字符串反转后:"+reverseStr);
		
	}

}

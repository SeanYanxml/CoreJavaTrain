package com.us.runoob.train.string;
/**
 * Java 实例 - 字符串替换
 * 如何使用java替换字符串中的字符呢？
 * 以下实例中我们使用 java String 类的 replace 方法来替换字符串中的字符：
 * */

public class StringReplace {
	public static void main(String[] args){
		String str = "Hey, Hello World!";
		System.out.println(str.replace('H', 'h'));// replace(lastChar,NowChar)
		System.out.println(str.replaceFirst("Hello", "OK"));
		System.out.println(str.replaceAll("He", "KO"));// replace(lastStr,NowStr)
		
	}

}

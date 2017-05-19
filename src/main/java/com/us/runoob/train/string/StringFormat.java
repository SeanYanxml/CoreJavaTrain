package com.us.runoob.train.string;

import java.util.Locale;

/**
 * Java 实例 - 字符串格式化 
 * 以下实例演示了通过 format() 方法来格式化字符串，还可以指定地区来格式化：
 * */
public class StringFormat {
	public static void main(String []args){
		double e = Math.E;
		System.out.format("%f%n", e);//%f:不指定宽度,整数部分全部输出并输出6位小数。%n 换行符号
		System.out.format(Locale.CHINA,"%-10.4f%n%n", e); // 2.718282 2.7183    
	}

}

/**
 *  java中的String.format使用  http://blog.csdn.net/cilen/article/details/7709488
 * 
 * */

package com.us.runoob.train.string;

/**
 * Java 实例 - 字符串分割 
 * 
 * 以下实例使用了 split(string) 方法通过指定分隔符将字符串分割为数组：
 * */
public class StringSplit {
	public static void main(String []args){
		String str = "www.yanxml.cn";
		String[] tmp ;
		String delimeter = "\\.";
		tmp = str.split(delimeter); // 指定分割字符， . 号需要转义
		System.out.println("-----------------------");
		for(String strTmp : tmp){
			System.out.println(strTmp);
		}
		System.out.println("-----------------------");
	}

}

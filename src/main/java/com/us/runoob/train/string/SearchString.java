package com.us.runoob.train.string;

/**
 * Java 实例 - 字符串搜索 
 * 
 * 以下实例使用了 String 类的 indexOf() 方法在字符串中查找子字符串出现的位置，
 * 如过存在返回字符串出现的位置（第一位为0），如果不存在返回 -1：
 * */

public class SearchString {
	public static void main(String []args){
		String str = "Abel Sean Bruce";
		int index = str.indexOf("Sean");
		if(index == -1){
			System.out.println("无字符串Sean");
		}else{
			System.out.println("Sean字符串位置 "+index);
		}
	}

}

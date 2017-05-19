package com.us.demo.trim;

public class TrimTest {
	public static void main(String []args){
		// 去除两端的空格
		String str1 = "     str1      ";
		System.out.println(str1);
		System.out.println(str1.trim());
		
		// 去除两端的Tab
		String str2="	str2				";
		System.out.println(str2);
		System.out.println(str2.trim());
	}

}

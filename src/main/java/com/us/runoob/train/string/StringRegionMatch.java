package com.us.runoob.train.string;

/**
 * Java 实例 - 测试两个字符串区域是否相等 
 * 
 * 以下实例使用了 regionMatches() 方法测试两个字符串区域是否相等：
 * */
public class StringRegionMatch {
	public static void main(String []args){
		String first_str="Hello Unistacks!";
		String second_str="Hello unistacks!";
		System.out.println("不忽视大小写: "+first_str.regionMatches(6, second_str, 6, 3));
		System.out.println("忽视大小写: "+first_str.regionMatches(true,6, second_str, 6, 3));
		
		System.out.println("不忽视大小写: "+first_str.regionMatches(7, second_str, 7, 3));
		System.out.println("忽视大小写: "+first_str.regionMatches(true,7, second_str, 7, 3));
	}
	/**
	 * 注意: String数据类型的第一位为0号位。
	 * 不忽视大小写: false
	 * 忽视大小写: true
	 * 不忽视大小写: true
	 * 忽视大小写: true
	 * */
}

/**
 *  first_str.regionMatches(11, second_str, 12, 9) 
 *  表示将 first_str 字符串从第11个字符"M"开始和 second_str 字符串的第12个字符"M"开始逐个比较，共比较 9 对字符，由于字符串区分大小写，所以结果为false。
 *  如果设置第一个参数为 true ，则表示忽略大小写区别，所以返回 true。 
 * */

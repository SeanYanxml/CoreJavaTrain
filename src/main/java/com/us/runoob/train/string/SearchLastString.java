package com.us.runoob.train.string;

/**
 * Java 实例 - 查找字符串最后一次出现的位置
 * 
 *  以下实例中我们通过字符串函数 strOrig.lastIndexOf(Stringname) 
 *  来查找子字符串 Stringname 在 strOrig 出现的位置：
 * 
 */
public class SearchLastString {
	public static void main(String []args){
		String str = "Hello Sean, Hello ShangHai!";
		String str2 = "Sean";
		int lastIndex = str.lastIndexOf("Hello");
		int lastIndex2 = str2.lastIndexOf("Hello");
		if(-1 == lastIndex){
			System.out.println("Can not find the str "+"Hello");
		}else{
			System.out.println("Last Index"+"Hello"+": "+lastIndex);
		}
		
		/**
		 * 输出结果为:
		 * 
		 * Last IndexHello: 12
		 * 
		 * */
		
		if(-1 == lastIndex2){
			System.out.println("Can not find the str2 "+"Hello");
		}else{
			System.out.println("Last Index"+"Hello"+": "+lastIndex);
		}
	}

}

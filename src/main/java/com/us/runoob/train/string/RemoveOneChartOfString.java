package com.us.runoob.train.string;

/**
 *  Java 实例 - 删除字符串中的一个字符
 *  以下实例中我们通过字符串函数 substring() 函数来删除字符串中的一个字符，我们将功能封装在 removeCharAt 函数中。实例代码如下：
 *  
 * */
public class RemoveOneChartOfString {
	public static void main(String []args){
		String str = "this is java";
		System.out.println(removeChartAt(str, 6));
		System.out.println(str.substring(0, 6));
		// substring(beginIndex,count) 表示 参数1 开始元素位置 以0号位计数 / 参数2 substring的长度
		// substring(beginIndex) 表示参数的开始位置
	}
	
	public static String removeChartAt(String s, int pos){
		// 存在异常让其直接抛出 由异常处理器一并处理
		return s.substring(0,pos)+s.substring(pos+1); //index为 [0 - (pos-1)]  +[(pos+1)-1 - end] 
	}
	
}

/**
 * String java.lang.String.substring(int beginIndex)
 * 
 * Returns a string that is a substring of this string. The substring begins
 * with the character at the specified index and extends to the end of this
 * string.
 * 
 * Examples:
 * 
 * "unhappy".substring(2) returns "happy" 
 * "Harbison".substring(3) returns "bison" 
 * "emptiness".substring(9) returns "" (an empty string)
 * 
 * Parameters: 
 * beginIndex the beginning index, inclusive. Returns: the specified substring. 
 * Throws: IndexOutOfBoundsException - if beginIndex is negative or larger than the length of this String object.
 */

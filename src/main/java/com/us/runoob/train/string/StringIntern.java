package com.us.runoob.train.string;

public class StringIntern {
	public static void main(String []args){
		String str1="aaa";
		String str2="bbb";
		String str3="aaabbb";
		String str4=str1+str2;
		String str5=str4.intern();
		for(int count=0;count<10;count++){
			System.out.println("----------------------------");
		long startTimeAdd = System.currentTimeMillis();
		for(long i=1;i<999999999;i++){
			boolean flag1 = (str5==str3);
		}
		long endTimeAdd = System.currentTimeMillis();
		System.out.println("Intern :"+ (endTimeAdd-startTimeAdd) +" ms");
		
		long startTimeAppend = System.currentTimeMillis();
		for(long i=1;i<999999999;i++){
			boolean flag2 = (str4==str3);
		}
		long endTimeAppend = System.currentTimeMillis();
		System.out.println("Not Intern Time :"+ (endTimeAppend-startTimeAppend)+" ms" );}
	}
	/**
	 * ----------------------------
Intern :419 ms
Not Intern Time :412 ms
----------------------------
Intern :375 ms
Not Intern Time :373 ms
----------------------------
Intern :393 ms
Not Intern Time :409 ms
----------------------------
Intern :387 ms
Not Intern Time :396 ms
----------------------------
Intern :422 ms
Not Intern Time :424 ms
----------------------------
Intern :401 ms
Not Intern Time :422 ms
----------------------------
Intern :366 ms
Not Intern Time :377 ms
----------------------------
Intern :371 ms
Not Intern Time :380 ms
----------------------------
Intern :391 ms
Not Intern Time :399 ms
----------------------------
Intern :494 ms
Not Intern Time :507 ms

	 * */
}

/**
 * Java String类中的intern()方法
 * http://www.cnblogs.com/dreamroute/p/3650399.html
 * 
 * 
 * JAVA中String类的intern()方法的作用 
 * http://blog.csdn.net/hfmbook/article/details/7605527
 * 
 * Java技术——你真的了解String类的intern()方法吗 
 * http://blog.csdn.net/baidu_31657889/article/details/52315902
 * */
 
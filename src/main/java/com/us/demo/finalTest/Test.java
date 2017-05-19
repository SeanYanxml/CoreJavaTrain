package com.us.demo.finalTest;

class Sample2 {
	final int var1; // 定义var1实例常量
	final int var2 = 0; // 定义并初始化var2实例常量

	Sample2() {
		var1 = 1; // 初始化var1实例常量
	}

	Sample2(int x) {
		var1 = x; // 初始化var1实例常量
	}
}     
public class Test {
	public static void main(String []args){
		Sample2 sm2 = new Sample2();
		System.out.println(sm2.var1);
	}
}

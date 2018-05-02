package com.yanxml.java8;

public class MethodDemo {
	public static void main(String[] args) {
//		f(()->System.out.println("123"));
//		f2((a, b)->System.out.println(a+b+"123"));
		
	}

//	private static void f(VoidTest v) {
//		// TODO Auto-generated method stub
//		v.f();	
//	}
	
	private static void f2(VoidTest v) {
		// TODO Auto-generated method stub
//		v.f2(1,2);	
		
	}
	
	public static <T1, T2> void hello(T1 t1,T2 t2){
		
	}
	
	interface ReturnTest{
		double f();
	}
	
	interface VoidTest{
//		public void f();
		public <T1, T2> void f2(T1 t1,T2 t2);
	}

}

// https://blog.csdn.net/maosijunzi/article/details/38616357
// java中实现类似函数指针的功能
// https://blog.csdn.net/u012441545/article/details/55805995

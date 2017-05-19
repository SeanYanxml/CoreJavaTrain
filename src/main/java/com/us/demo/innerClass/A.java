package com.us.demo.innerClass;

public class A{
	public static void main(String[] args){
		OuterClass outer = new OuterClass();
		OuterClass.StaticInnerClass staticClass = new OuterClass.StaticInnerClass();
	}
}
class OuterClass {
	public static class StaticInnerClass {
		private int v;
		public void say() {
			System.out.println("hello");
		}
	}
}
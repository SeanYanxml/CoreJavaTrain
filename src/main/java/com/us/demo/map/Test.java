package com.us.demo.map;

public class Test {
	public static void main(String[] args) {

		A a = new B();
	}
}

class A {
	protected String name = "lisi";
	static String a = "Fathera";
	int numberA = 0;
	static {
		System.out.println("A静态代码块: " + a);
	}
	public A() {
		System.out.println("父类构造器A");
		System.out.println("父类构造器A中调用test方法开始,由于子类重写过test方法所以这里执行子类的test方法");
		test();
		numberA = 1;
		System.out.println("numberA:" + numberA);
		System.out.println("父类构造器A中调用test方法结束");
	}
	public void test() {

	}

}

class B extends A {
	static String b = "SonB";
	static {
		System.out.println("A静态代码块: " + b);
	}
	private String name = "tom";
	{
		System.out.println("子类匿名代码块中:" + name);
	}
	public B() {
		System.out.println("子类构造器B");
	}
	public void test() {

		System.out.println("test方法中:this.name=" + this.name);
		System.out.println("test方法中:super.name=" + super.name);
	}
}

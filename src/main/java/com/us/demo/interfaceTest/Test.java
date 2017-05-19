package com.us.demo.interfaceTest;

public class Test {

}
 interface A {
//    private void method3(); // 不合法
//	 Illegal modifier for the interface method method3; only public & abstract are permitted
	void method1(); // 合法，默认为public、abstract类型
	public abstract void method2();// 合法，显示声明为public、abstract类型
}

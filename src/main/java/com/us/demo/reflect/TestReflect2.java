package com.us.demo.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// interface
interface Subject{
	public String say(String name, int age);
}
//project
class RealSubject implements Subject{
	public String say(String name ,int age){return name+"  "+age;}
}

class MyInvocationHandler implements InvocationHandler{
	private Object obj =null ;
	public Object bind (Object obj){
		this.obj=obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
		// TODO Auto-generated method stub
		Object obj=method.invoke(this.obj, args);
		return obj;
	}
}

/*
 * Java 内的类加载器 主要有3类:
 * 1. BootStrap ClassLoader 类, 此加载器c采用c++编写
 * 2. Extension ClassLoader 类 ,主要用来扩展类的加载,一般对应jre libtext目录下的类
 * 3. AppClassLoader加载classpath下的指定类，是最常用的类加载器。也是java中默认的类加载器。
 * 如果想要完成动态代理，首先需要定义一个InvocationHandler的接口的子类，已完成代理的具体操作。也就是invoke()方法。
 * */

public class TestReflect2 {
	public static void main(String []args){
		// 获取Java的类加载器
		//TestReflect2 reflect=new TestReflect2();
		//System.out.println(reflect.getClass().getClassLoader().getClass().getName());
		
		MyInvocationHandler handler =new MyInvocationHandler();
		Subject subj=(Subject) handler.bind(new RealSubject());
		String info=subj.say("Hello", 20);
		System.out.println(info);
	}


}

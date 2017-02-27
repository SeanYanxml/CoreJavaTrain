package com.us.demo.reflect;

// 工厂模式的编写 使用反射机制达到
interface InfSay{
	public abstract void say();
}

// 中国人
class Chiness implements InfSay{
	public void say(){
		System.out.println("你好");
	}
}

//美国人
class American implements InfSay{
	public void say(){
		System.out.println("Hello");
	}
}

class Factory{
	public static Object getInstance(String className){
		Object obj=null;
		try{
			obj=Class.forName(className).newInstance();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return obj;
	}
	
	public static InfSay getInstanceInfSay(String className){
		InfSay infSay=null;
		try{
			infSay=(InfSay)Class.forName(className).newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
		return infSay;
	}
}
public class TestReflect4 {
	public static void main(String []args){
		// 根据类的字符串加载 (Spring 的类加载机制 就是利用了反射的机制)
		InfSay infSay1 = Factory.getInstanceInfSay("com.us.demo.reflect.Chiness");
		InfSay infSay2 = Factory.getInstanceInfSay("com.us.demo.reflect.American");

		if(infSay1!=null){
			infSay1.say();
		}
		
		if(infSay2!=null){
			infSay2.say();
		}
	}
}

/**
 * 参考博客的地址: Java反射机制详解
 * http://www.cnblogs.com/lzq198754/p/5780331.html
 * 
 * 对于普通的工厂模式当我们在添加一个子类的时候，就需要对应的修改工厂类。 当我们添加很多的子类的时候，会很麻烦。
 * Java 工厂模式可以参考
 * http://baike.xsoftlab.net/view/java-factory-pattern
 * 
 * 现在我们利用反射机制实现工厂模式，可以在不修改工厂类的情况下添加任意多个子类。
 * 
 * 但是有一点仍然很麻烦，就是需要知道完整的包名和类名，这里可以使用properties配置文件来完成。
 * 
 * java 读取 properties 配置文件 的方法可以参考
 * http://baike.xsoftlab.net/view/java-read-the-properties-configuration-file
 * 
 * @author xsoftlab.net
 */

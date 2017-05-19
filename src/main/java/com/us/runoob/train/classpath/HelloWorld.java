package com.us.runoob.train.classpath;

public class HelloWorld {
	public static void main(String []args){
		System.out.println("Hello World!");
	}
}

/**
 * 1. 如何编译一个java文件
 * 
 * javac HelloWorld.java
 * 
 * 2. 如何执行一个java文件
 * 
 * java HelloWorld
 * 
 * 
 * 注意点 1.非常注意classpath的位置 2.java内的一个类的全部名称为 包名+类名
 * 
 * 参考文章:
 * 使用java命令运行class文件提示“错误：找不到或无法加载主类“的问题分析
 * [http://www.cnblogs.com/wangxiaoha/p/6293340.html]
 * 
 * localhost:java Sean$ java com.us.runoob.train.classpath.HelloWorld Hello
 * World! localhost:java Sean$ pwd
 * /Users/Sean/Documents/Gitrep/corejava/src/main/java
 * 
 *
 * 
 * 3. 如何指定java运行的classpath
 * 
 * java -classpath ../HelloWorld
 * 
 * java -classpath ../HelloWorld.jar
 * 
 * 4. 如何查看java的版本号
 * 
 * java -version
 * 
 * 结果: localhost:~ Sean$ java -version 
 * 
 * java version "1.8.0_102" Java(TM) SE
 * Runtime Environment (build 1.8.0_102-b14) Java HotSpot(TM) 64-Bit Server VM
 * (build 25.102-b14, mixed mode)
 * 
 */
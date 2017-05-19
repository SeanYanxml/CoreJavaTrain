package com.us.demo.abstractTest;

//定义一个抽象类
abstract class student{
	int a;
//	abstract int abstractA;// 报错
  //抽象方法
  public abstract void study();
  //非抽象方法
  public void work(){
      System.out.println("努力学习");
  }
}
class goodstudent extends student{
	int abstractA = 1;
  //必须要实现抽象方法，否则该类依然是个抽象类
  public void study(){
      System.out.println("好学生不学习");
  }
}
public class Test {
  public static void main(String[] args) {
      // goodstudent s=new goodstudent();
      //调用实现的方法
      // s.study();
      //调用从抽象类中继承的非抽象方法
      //s.work();
	  System.out.println(System.currentTimeMillis());
  }
}
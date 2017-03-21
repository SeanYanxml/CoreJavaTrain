package com.us.demo.extend;

class TransferBase{
	public String str = "Base";
	public void method(){
		System.out.println("Base");
	}
}
class TransExtend extends TransferBase{
	public String str = "Extend";
	public void superMethod(){
		super.method();
	}
	public void method(){
		System.out.println("Trans");
	}
}
public class TransferExtendTest {
	public static void main(String []args){
		TransferBase trans = new TransExtend();
//		trans.method(); 
//		((TransferBase)trans).method();//没用 只有让指针重新指向父类的空间
//		((TransExtend)trans).superMethod();// 可以 但是违背了多态的思想 有点鸡肋
		
		TransferBase trans2 =  (TransferBase)trans;
//		trans2.method(); // 还是没用
		
		System.out.println(trans.str);
		System.out.println(((TransferBase)trans).str);
		System.out.println(trans2.str);
		System.out.println(((TransExtend)trans2).str);

		//第一种: 
		// 子类 重现的方法中 使用 super关键字 去调用父类中的方法或属性； 
		//第二种： 
		//直接实例化 父类 
		
		
//		如果不是类内部，而是外部调用，比如你例子中的main方法，答案是 
//
//		不能。你不能调用已经被覆盖掉的父类的方法。 
//
//		这也是覆盖override的最初设计意图之一。 
//
//		大多数时候，覆盖父类意味着子类想做些特殊的处理。如果能够跳过子类的特殊处理，就会打开一个无法控制的缺口，会导致很多很多问题。 
//
//		唯一可以调用父类方法的地方，就只有类内部。子类自己控制，什么时候该调用父类，什么时候做自己的处理。
	}


}

package com.us.demo.javadoc;

/**
 * @author Sean
 * @version v1.0
 * @since 2017-01-20
 * */
public class Example {
	/**
	 * @author Sean
	 * @since 2017-01-20
	 * @param String []args
	 * @return void
	 * **/
	int a;
	public void print(){
		System.out.println(a);
	}
	public static void main(String []args){
//		System.out.println("This is a JavaDoc Example.");
//		System.out.println(args.length);
//		System.out.print("HEllo");//print println printf
		int size=2;
		int isArray[]=new int[size];
		new Example().print();
	}
}

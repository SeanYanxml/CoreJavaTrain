package com.us.demo.extend;

class Base{
	private String showMe(){
//	public String showMe(){

		return "Base";
	}
	public void print(){
		System.out.println(showMe());
	}
}

class Sub extends Base{
	public String showMe(){ //The method showMe() from the type Sub is never used locally
		return "Sub";
	}
}
public class PrivateExtend {
	public static void main(String []args){
		Sub sub = new Sub();
		sub.print();
		System.out.println(sub.showMe());
	}

}

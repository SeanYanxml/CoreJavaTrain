package com.us.demo.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestReflect3 {
	
	public static void main(String []args) throws Exception{
		//method1();
		//method2();
		method3();
	}
	
	// 1. 泛型为Integer类型的 ArrayList内 存放一个String类型的对象
	public static void method1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		ArrayList<Integer> array=new ArrayList<Integer>();
		Method method = array.getClass().getMethod("add", Object.class);
		method.invoke(array, "Hello");
		System.out.println(array.get(0));
	}
	
	//2. 通过反射取得并修改数组的信息
	public static void method2(){
		int [] tmp={1,2,3,4,5};
		Class<?> classzz=tmp.getClass().getComponentType();
		System.out.println("数组类型为: "+ classzz.getName());
		System.out.println("数组长度为: "+Array.getLength(tmp));
		System.out.println("数组的第一个元素为: "+Array.get(tmp, 0));
		Array.set(tmp, 0, 100);
		System.out.println("数组修改后的第一个元素为: "+ Array.get(tmp, 0));
	}
	
	// 3.1 修改数组的大小
	public static Object arrayInc(Object obj,int len){
		Class<?> arr=obj.getClass().getComponentType();
		Object newArr=Array.newInstance(arr, len);
		int co=Array.getLength(obj);
		//demo 简单点 默认len的长度 大于 原数组的长度
		System.arraycopy(obj, 0, newArr, 0, co);
		return newArr;
	}
	// 3.2 打印
	public static void print(Object obj){
		//用反射 打印数组内的值
		Class<?> c = obj.getClass();
		if(!c.isArray()){
			return ;
		}
		System.out.println("数组的长度为: "+Array.getLength(obj));
		for(int i=0;i<Array.getLength(obj);i++){
			System.out.print(Array.get(obj,i)+"  ");
		}
		System.out.println();
	}
	//3. 通过反射机制修改数组的大小
	public static void method3(){
		int [] tmp={1,2,3,4,5,6,7,8,9};
		int [] newTmp=(int []) arrayInc(tmp,15);
		print(newTmp);
		String []atr={"a","b","c"};
		String []newAtr=(String[])arrayInc(atr,8);
		print(newAtr);
	}
}

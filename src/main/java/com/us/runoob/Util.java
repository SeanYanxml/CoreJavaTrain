package com.us.runoob;

public class Util {
	public static void printIntegerArray(Integer [] array){
		System.out.println("--------------------------");
		for(Integer obj: array){
			System.out.print(" "+obj+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
	}
	
	public static void printObjectArray(Object [] array){
		System.out.println("--------------------------");
		for(Object obj: array){
			System.out.print(" "+obj+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
	}

}

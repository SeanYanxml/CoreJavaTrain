package com.yanxml.java8;

import java.util.Arrays;
import java.util.List;

public class MethodParameterDemo2 {

	interface MyComparable<T extends Comparable<T>> {
//		public int compare(T obj1, T obj2);
		public int compare2(T obj1, T obj2);
	}

	public static <T extends Comparable<T>> void sort(List<T> list,
			MyComparable<T> comp) {
		// sort the list
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c");
		System.out.println(list);
		sort(list, (a, b) -> a.length()-b.length());
		System.out.println(list);
	}

	// 比较难以看懂～
	// https://stackoverflow.com/questions/22588518/lambda-expression-and-generic-method
}

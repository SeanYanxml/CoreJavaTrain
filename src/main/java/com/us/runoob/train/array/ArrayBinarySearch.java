package com.us.runoob.train.array;

import java.util.Arrays;

import com.us.runoob.Util;

/**
 * Java 实例 - 数组排序及元素查找
 * 以下实例演示了如何使用sort()方法对Java数组进行排序，
 * 及如何使用 binarySearch() 方法来查找数组中的元素, 
 * 这边我们定义了 printArray() 方法来打印数组：
 * */
public class ArrayBinarySearch {
	public static void main(String[] args) {
		Integer array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
		Util.printIntegerArray(array);
		Arrays.sort(array);
		Util.printIntegerArray(array);
		int index = Arrays.binarySearch(array, 2);
		System.out.println("Element 2's index is :" + index); // array的index头 从0开始
	}
	
	/** 预计输出为:
	 * --------------------------
	 * 2  5  -2  6  -3  8  0  -7  -9  4 
	 * --------------------------
	 * --------------------------
	 * -9  -7  -3  -2  0  2  4  5  6  8 
	 * --------------------------
	 * Element 2's index is :5
	 * 
	 * */
}

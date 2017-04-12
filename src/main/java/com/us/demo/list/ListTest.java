package com.us.demo.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String []args){
		// 判断元素的个数
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(2);
		System.out.println(list1.size());
		// list的元素可以重复 有插入的顺序
		
	}

}

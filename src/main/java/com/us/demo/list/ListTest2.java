package com.us.demo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest2 {
	public static void main(String []args){
		// 如何寻找出两个list内不相同的元素
		// 方法1:
		List list1 = new ArrayList();
		Role role1 = new Role(1,"Hello");
		list1.add(role1);
		list1.add(new Role(1,"Just"));
		List list2 = new ArrayList();
		list2.add(new Role(1,"Hello"));
		List diffList = new ArrayList(Arrays.asList(new Object[list1.size()]));
	    Collections.copy(diffList, list1);
	    diffList.removeAll(list2);
	    for(Object role : diffList){
	    	System.out.println(	 ((Role)role).id+" "+((Role)role).name);
	    }
	    
	    // 方法2: 重写equals方法 因为list自带的函数，是通过equals函数进行判断的
	}

}
class Role {
	public Integer id;
	public String name;
	public Role(){}
	public Role(Integer id, String name){this.id=id;this.name=name;}
}

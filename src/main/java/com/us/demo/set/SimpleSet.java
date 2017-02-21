package com.us.demo.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 集合 Set类型
public class SimpleSet {
	public static void main(String []args){
		Set set =new HashSet();
		String s1=new String ("s1");
		String s2=s1;
		String s3=new String("s3");
		String s4=new String("s3");

		// Add
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println(set.size());
	}
	
	public boolean myAdd(Set set,Object object){
		boolean isExit=false;
		Iterator iterator= set.iterator();
		while(iterator.hasNext()){
			Object tmp=iterator.next();
			if(tmp.equals(object)){
				isExit=true;
				break;
			}
		}
		return isExit;
	}

}
// 问题一：为什么Set s =new HashSet()而不是Set s = new Set()
// 问题二：还有List的时候也是List list = new ArrayList();为什么不写成ArrayList list = new ArrayList
// http://bbs.csdn.net/topics/391049065?page=1
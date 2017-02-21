package com.us.demo.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public class CustomerComparator implements Comparator{
		public int compare(Object o1,Object o2){
			Customer customer1=(Customer)o1;
			Customer customer2=(Customer)o2;
			if((customer1.name).compareTo(customer2.name)>0){return 1;}			
			else if((customer1.name).compareTo(customer2.name)<0){return -1;}
			else{ return 0;}
		}
	}
	public static void main(String []args){
//		Set set=new HashSet();
//		set.add(new Customer("hello", 1));
//		set.add(new Customer("hello", 1));
//		System.out.println(set.size());
//		// 说明除了 equals()方法外 还需要重写hashcode方法
		
		// http://stackoverflow.com/questions/16857925/no-enclosing-instance-of-type-mprogram-is-accessible-must-qualify-the-allocatio
		// No enclosing instance of type SetTest is accessible. 
		// Must qualify the allocation with an enclosing instance of type SetTest 
		// (e.g. x.new A() where x is an instance of SetTest).
		// 注意内部类的使用方法
		SetTest test1=new SetTest();
		Set set=new TreeSet(test1.new CustomerComparator());
		Customer customer1=new Customer("Abel", 10);
		Customer customer2=new Customer("Kitty", 10);
		Customer customer3=new Customer("Jett", 10);
		set.add(customer1);
		set.add(customer2);
		set.add(customer3);
		
		Iterator iterator=set.iterator();
		while(iterator.hasNext()){
			Customer customer=(Customer) iterator.next();
			System.out.println("name: "+(customer.name)+"  size: "+(customer.size));
		}		
	}

}

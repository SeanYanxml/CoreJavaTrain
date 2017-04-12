package com.us.demo.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ForeachMapTest {
	
	public static void main(String []args){
		Map<String,String> map = new HashMap<String, String>();
		map.put("1", "Jack");
		map.put("2", "Sam");
		map.put("3", "abel");
		
		// first method 我经常使用这种方法
		System.out.println("First Method");
		for(Entry<String, String> enrty : map.entrySet()){
			System.out.println("id:"+enrty.getKey()+" name:"+enrty.getValue());
		}
		System.out.println("");

		
		// second method
		System.out.println("Second Method");
		for(String key : map.keySet()){
			System.out.println("Key:"+key+" value:"+map.get(key));
		}
		System.out.println("");

		
		// Third method
		System.out.println("Third Method");
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<String, String> entry = iterator.next();
			System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
		}
		System.out.println("");

		
		//Forth method
		System.out.println("Forth Method");
		for(String value : map.values()){
			System.out.println(" value:"+value);
		}
		System.out.println("");

		
	}

}


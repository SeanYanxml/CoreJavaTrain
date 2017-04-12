package com.us.demo.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 测试：遍历的同时，删除List的元素
 * 注意点:（因为List在被删除之后，Index会自动上移动，所以会导致遍历的出错。一般采用Iterator进行处理）
 * 
 * 参考地址:
 * JAVA中循环删除list中元素的方法总结
 * http://www.cnblogs.com/pcheng/p/5336903.html
 */
public class ListTest3 {
	
	public static void main(String []args){
		List<String> list = new ArrayList<String>();
		list.add("abel");
		list.add("sean");
		list.add("sean");
		list.add("henley");
		
//		// 方法1:
//		print(list);
//		//删除 错误
//		for(int i=0; i<list.size();i++){
//			if(list.get(i) == "sean"){
//				list.remove(i);
//			}
//			// 注意 比如1，2，3，4 。删除了3后，4就变成了3。会导致数据的越界和其他情况
//		}
//		print(list);
		/*
		 * --------------- abel sean sean henley --------------- 
		 * ---------------abel sean henley ---------------
		 * 注意有一个没有删除掉
		 */
		
//		// 方法2: 增强for循环
//		print(list);
//		 //删除 错误
//		 for(String s:list){
//			 if(s.equals("sean")){
//				 list.remove(s);
//			 }
//		 }
//		 // 注意 比如1，2，3，4 。删除了3后，4就变成了3。会导致数据的越界和其他情况
//		print(list);
		/*---------------
		abel
		sean
		sean
		henley
		---------------
		删除后就会报错，因为并发错误
		Exception in thread "main" java.util.ConcurrentModificationException
		at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
		at java.util.ArrayList$Itr.next(ArrayList.java:851)
		at com.us.demo.list.ListTest3.main(ListTest3.java:38)
		 * */
		
		print(list);
		 //删除 正确
		Iterator<String> iterator = list.iterator();
		 while(iterator.hasNext()){
			 if(iterator.next().equals("sean")){
				 iterator.remove();// 注意使用的是iterator的remove,而不是list的remove
			 }
		 }
		 // 注意 比如1，2，3，4 。删除了3后，4就变成了3。会导致数据的越界和其他情况
		print(list);
		
	}
	
	public static void print(List list){
		System.out.println("---------------");
		for(Object o: list){
			System.out.println(o);
		}
		System.out.println("---------------");
	}

}

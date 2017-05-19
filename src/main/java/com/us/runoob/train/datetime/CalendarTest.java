package com.us.runoob.train.datetime;

import java.util.Calendar;

/**
 *  以下实例演示了如何使用 Calendar 类来输出年份、月份等： 
 *  
 * */
public class CalendarTest {
	
	public static void main(String []args){
		Calendar calendar = Calendar.getInstance(); // 工厂模式 可以创建多个实例的工厂模式
		
		int day = calendar.get(Calendar.DATE);
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		
		int dow = calendar.get(Calendar.DAY_OF_WEEK);// 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
		int dom = calendar.get(calendar.DAY_OF_MONTH);
		int doy = calendar.get(calendar.DAY_OF_YEAR);
		
		System.out.println("当前时间"+calendar.getTime());
		System.out.println("日期:"+day);
		System.out.println("月份:"+month);
		System.out.println("年份:"+year);
		System.out.println("一周第几天:"+dow);
		System.out.println("一月第几天:"+dom);
		System.out.println("一年第几天:"+doy);

		/**
		 * 当前时间Thu Apr 13 14:34:33 CST 2017 
		 * 日期:13 
		 * 月份:3 
		 * 年份:2017 
		 * 一周第几天:5 
		 * 一月第几天:13
		 * 一年第几天:103
		 */

 	}

}

package com.us.runoob.train.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentTime {
	
	public static void main(String []args){
		
		Date date = new Date(); //获取当前的时间
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");// a为pm 和 am标志
		System.out.println("Current Time : "+simpleDate.format(date));
		
		System.out.println("TimeStamp: " + System.currentTimeMillis());
		
		/**
		 * 输出结果:
		 * Current Time : 2017-04-13 14:14:03 下午 
		 * 1492064043502 //13位时间戳 精确到毫秒级别
		 */
	}

}

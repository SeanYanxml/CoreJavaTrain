package com.us.runoob.train.datetime;

import java.text.SimpleDateFormat;

// 注意 Date 有 java.util.Date 和 java.sql.Date
// 我们经常使用的是 java.util.Date 这个类

import java.util.Date;

public class DateFormat {
	public static void main(String[] args){
		Date date = new Date();
		String strDateFormat = "yyyy-MM-dd HH:mm:ss"; 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strDateFormat);
		System.out.println(simpleDateFormat.format(date));
		System.out.println(System.currentTimeMillis());
		
		/**
		 * 运行结果:
		 * 2017-04-13 11:24:16
		 * 
		 * 可以控制SimpleDateFormat("XX") 来控制转换的数据类型的格式
		 * 
		 * */
	}

}

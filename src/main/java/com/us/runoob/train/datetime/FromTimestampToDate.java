package com.us.runoob.train.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FromTimestampToDate {
	
	public static void main(String[] args){
		Long nowTimeStamp = System.currentTimeMillis();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = formater.format(new Date(nowTimeStamp));
		System.out.println("The TimeStamp is that: "+nowTimeStamp);
		System.out.println("Now date is that : "+ dateStr);
	} 

}

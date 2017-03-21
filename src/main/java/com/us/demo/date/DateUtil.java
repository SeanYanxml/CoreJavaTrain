package com.us.demo.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static void main(String []args){
		Date date =new Date();
		System.out.println(date.getTime());

		SimpleDateFormat sdf =new SimpleDateFormat("HH:mm:ss");//只有时分秒
		//SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//完整的时间
		String time=sdf.format(date);
		System.out.println(time);
	}

}

package com.us.runoob.train.network;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * NO 9.
 * Java 实例 - 获取 URL响应头的日期信息 
 * 以下实例演示了如何使用 HttpURLConnection 的 httpCon.getDate() 方法来获取 URL响应头的日期信息
 * */
public class GetDateFromUrl {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://csdn.yanxml.cn");
		HttpURLConnection httpConn = (HttpURLConnection)url.openConnection();
		long date = httpConn.getDate();
		if(date == 0){
			System.out.println("Failed!");
		}else{
			System.out.println("Date: "+date);
		}
	}
}
/**
 * 预期输出:
Date: 1493637847000
 * */

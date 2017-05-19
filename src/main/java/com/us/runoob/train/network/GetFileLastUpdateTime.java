package com.us.runoob.train.network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;

/**
 * NO 6.
 * Java 实例 - 查看主机指定文件的最后修改时间 
 * 以下实例演示了如何查看主机指定文件的最后修改时间：
 * */
public class GetFileLastUpdateTime {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://cpro.baidustatic.com/cpro/exp/closead/img/bd_logo.png");
		URLConnection conn = url.openConnection();
		conn.setUseCaches(false);
		long timestamp = conn.getLastModified();
		System.out.println("File last update : "+ formatDate(timestamp));
	}
	public static String formatDate(long timesrtamp){
	    //时间戳转化为Sting或Date  
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Long time=new Long(timesrtamp);  
        String dateStr = format.format(time);  
        return dateStr;
        //Date date=format.parse(d);  
	}
}
/**
 * 预期结果:
 * File last update : 2017-04-28 12:21:26
 * */

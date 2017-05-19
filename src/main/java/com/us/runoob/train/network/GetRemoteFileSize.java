package com.us.runoob.train.network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Java 实例 - 获取远程文件大小 
 * 以下实例演示了如何获取远程文件的大小：
 * */
public class GetRemoteFileSize {
	public static void main(String[] args) throws IOException {
		int size = 0;
		// baidu logo
		URL url = new URL("http://cpro.baidustatic.com/cpro/exp/closead/img/bd_logo.png");
		URLConnection conn = url.openConnection();
		size = conn.getContentLength();
		if(size < 0){
			System.out.println("We can not get the file size.");
		}else{
			System.out.println("The file size is : "+size+"byte");
		}
		conn.getInputStream().close();
	}
}

/**
 * 预期结果:
 * The file size is : 2781byte
 * */

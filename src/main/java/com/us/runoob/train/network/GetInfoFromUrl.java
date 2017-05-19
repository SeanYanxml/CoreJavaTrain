package com.us.runoob.train.network;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Java 实例 - 解析 URL 
 * 以下实例演示了如何使用 net.URL 类的 url.getProtocol() ,url.getFile() 等方法来解析 URL 地址
 * */
public class GetInfoFromUrl {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.w3school.com.cn/html");
		System.out.println("URL: "+url.toString());
		System.out.println("Protocol: "+url.getProtocol());
		System.out.println("FileName: "+url.getFile());
		System.out.println("Host: "+url.getHost());
		System.out.println("Path: "+url.getPath());
		System.out.println("Port: "+url.getPort());
		System.out.println("DefaultPort: "+url.getDefaultPort());
	}
}
/**
 * 预期结果:
URL: http://www.w3school.com.cn/html
Protocol: http
FileName: /html
Host: www.w3school.com.cn
Path: /html
Port: -1
DefaultPort: 80
 * */

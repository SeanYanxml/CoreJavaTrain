package com.us.runoob.train.network;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * NO 10.
 * Java 实例 - 获取 URL 响应头信息 
 * 以下实例演示了如何获取指定 URL 的响应头信息：
 * */
public class GetUrlParamter {
	public static void main(String[] args) throws IOException {
		URL url=new URL("http://csdn.yanxml.cn");
		URLConnection conn = url.openConnection();
		// 注意 这个Map的结构为 String - List<String> 类型 
		Map<String, List<String>> headers = conn.getHeaderFields();
		for(String key : headers.keySet()){
			String val = conn.getHeaderField(key);
			System.out.println(key+" : "+val);
		}
		System.out.println("LastModified : " + conn.getLastModified());
	}
}
/**
 * 预期结果:
 null : HTTP/1.1 200 OK
x-oss-request-id : 59071E4F1A1B3469CA785B57
x-oss-server-time : 83
Server : AliyunOSS
x-oss-object-type : Normal
Connection : keep-alive
Last-Modified : Mon, 14 Nov 2016 15:48:20 GMT
Date : Mon, 01 May 2017 11:38:55 GMT
Content-MD5 : ol9HNvxYZiiEx7bI4TfUOg==
Accept-Ranges : bytes
x-oss-hash-crc64ecma : 5760371668009658141
ETag : "A25F4736FC58662884C7B6C8E137D43A"
Content-Length : 187
Content-Type : text/html
LastModified : 1479138500000
 * */

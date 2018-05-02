package com.yanxml.util.http;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

public class HttpClientUtil {
	/**
	 * 返回页面图片预览.(http请求地址读取图片，将其转换为流放置在reponse返回给另一头)
	 *
	 * @param response the response
	 * @param url the url
	 * @return file exists true / file not exists false
	 * @throws Exception the exception
	 */
	public static boolean getPicture(HttpServletResponse response, String url) throws Exception {
		// 路径为文件且不为空则取图片文件
		HttpClient client = new HttpClient();
		HttpMethod method = new GetMethod(url);
		client.executeMethod(method);
		byte[] data = method.getResponseBody();
		// 将二进制流 写入response的outputstream
		response.setContentType("image/png");
		OutputStream out = response.getOutputStream();
		out.write(data);
		out.flush();
		out.close();
		method.releaseConnection();
		return true;
	}
	
	/**
	 * Http的POST类型请求
	 * @author Sean
	 * @since 2017-06-08
	 * */
	public static String httpPostMethod(String url, String paramStr) throws HttpException, IOException {
		HttpClient client = new HttpClient();
		// 设置代理服务器地址和端口(没有则不需要设置)
		// client.getHostConfiguration().setProxy("proxy_host_addr",proxy_port);
		// 使用POST方法
		PostMethod method = new PostMethod(url);
		if(null != paramStr){
			method.setRequestEntity(new StringRequestEntity(paramStr));
		}
		client.executeMethod(method);
		String response = method.getResponseBodyAsString();
		// 释放连接
		method.releaseConnection();
		return response;
	}
	
	/**
	 * Http的GET类型请求
	 * @author Sean
	 * @since 2017-06-08
	 * */
	public static String httpGetMethod(String url) throws HttpException, IOException {
		HttpClient client = new HttpClient();
		// 使用 GET 方法 ，如果服务器需要通过 HTTPS 连接，那只需要将下面 URL 中的 http 换成 https
		HttpMethod method = new GetMethod(url);
		client.executeMethod(method);
		String response = method.getResponseBodyAsString();
		// 释放连接
		method.releaseConnection();
		return response;
	}
	
	public static void main(String[] args) throws HttpException, IOException {
		// Test baidu get method
		String getMethodResult = httpGetMethod("http://www.baidu.com");
		System.out.println("Get Method: " + getMethodResult);
		
		// Test baidu post method
		String postMethodResult = httpPostMethod("http://www.baidu.com", null);
		System.out.println("Post Method: " + postMethodResult);

	}

}

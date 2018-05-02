package com.yanxml.util.http;

import java.io.IOException;

import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OKHttpUtil {

	/**
	 * 向一处服务器发送POST请求。
	 * 
	 * @param url
	 *            : The url to post request.
	 * @param headers
	 *            : The http headers.
	 * @param body
	 *            : The request body.
	 */
	public static Response httpPost(String url, Headers headers,
			RequestBody body) {
		OkHttpClient httpClient = new OkHttpClient();
		Request.Builder requestBuilder = new Request.Builder();

		if (null != headers) {
			requestBuilder.headers(headers);
		}
		Request request = requestBuilder.url(url).post(body).build();
		Response response = null;
		try {
			response = httpClient.newCall(request).execute();
		} catch (IOException e) {
			System.out.println("faild to send event to manager: " + e);
		}
		return response;
	}

	/**
	 * 向一处服务器发送POST请求。
	 * 
	 * @param url
	 *            : The url to post request.
	 * @param headers
	 *            : The http headers.
	 * @param body
	 *            : The request body.
	 */
	public static Response httpGet(String url, Headers headers) {
		OkHttpClient httpClient = new OkHttpClient();
		Request.Builder requestBuilder = new Request.Builder();
		
		if (null != headers) {
			requestBuilder.headers(headers);
		}
		Request request = requestBuilder.url(url).get().build();

		Response response = null;
		try {
			response = httpClient.newCall(request).execute();
		} catch (IOException e) {
			System.out.println("faild to send event to manager: " + e);
		}
		return response;
	}

	// test demo
	public static void main(String[] args) throws IOException {
		// GetDemo
//		Response getResponse = httpGet("http://www.baidu.com", null);
//		System.out.println("Get response: " + getResponse.body().string());
		
		//PostDemo
    	RequestBody requestbody = RequestBody.create(MediaType.parse("application/json"), "");// 内容为空，有新需求赋值
		Response postResponse = httpPost("http://www.baidu.com", null, requestbody);
		System.out.println("Post response: " + postResponse.body().string());
	}

}

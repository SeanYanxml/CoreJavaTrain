package com.us.runoob.train.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Java 实例 - 获取本机ip地址及主机名 
 * 以下实例演示了如何使用 InetAddress 类的 getLocalAddress() 方法获取本机ip地址及主机名：
 * */
public class GetLocalHost {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address=InetAddress.getLocalHost();
		System.out.println("Localhost's name is : "+address.getHostName());
		System.out.println("Localhost's address is : "+address.getHostAddress());
	}
}

/**
 * 预期结果:
Localhost's name is : localhost
Localhost's address is : 127.0.0.1
 */
 
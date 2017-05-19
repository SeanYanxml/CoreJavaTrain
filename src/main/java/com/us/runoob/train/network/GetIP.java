package com.us.runoob.train.network;

import java.net.InetAddress;

/**
 * Java 实例 - 获取指定主机的IP地址 
 * 以下实例演示了如何使用 InetAddress 类的 InetAddress.getByName() 方法来获取指定主机（网址）的IP地址：
 * 
 * */
public class GetIP {
	public static void main(String []args){
		InetAddress address = null;
		try{
			address = InetAddress.getByName("csdn.yanxml.cn");
		}catch(Exception ex){
			System.exit(2);
		}
		System.out.println(address.getHostName()+" = "+address.getHostAddress());
		System.exit(0);;
	}

/**
 * 输出:
 * csdn.yanxml.cn = 139.196.67.71
 * */

}

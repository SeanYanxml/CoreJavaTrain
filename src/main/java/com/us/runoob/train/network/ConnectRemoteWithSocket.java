package com.us.runoob.train.network;

import java.net.InetAddress;
import java.net.Socket;
/**
 * Java 实例 - 使用 Socket 连接到指定主机 
 * 以下实例演示了如何使用 net.Socket 类的 getInetAddress() 方法来连接到指定主机：
 * */
public class ConnectRemoteWithSocket {
	public static void main(String[] args) {
		try{
			InetAddress address;
			Socket socket = new Socket("csdn.yanxml.cn", 80);
			address = socket.getInetAddress();
			System.out.println("Connect the remote : " + address);
			socket.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Connection Exception.");
			System.out.println(e);
		}
	}
}
/**
 * 预期结果:
 * Connect the remote : csdn.yanxml.cn/139.196.67.71
 * */

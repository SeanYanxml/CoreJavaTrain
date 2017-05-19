package com.us.demo.thread;

public class ThreadTest {
	public static void main(String []args){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
			
			if(i==30){
				Thread thread1=new MyThread();
				Thread thread2=new MyThread();
				
				thread1.start();
				thread2.start();
			}
		}
	}

}

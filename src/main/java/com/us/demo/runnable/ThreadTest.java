package com.us.demo.runnable;

public class ThreadTest {
	public static void main(String []args){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"  "+i);
			
			if(i==30){
				Runnable myRunnable=new MyRunnable();
				Thread thread1=new Thread(myRunnable);
				Thread thread2=new Thread(myRunnable);
				
				thread1.start();
				thread2.start();
				// 有点问题 为什么会在某个线程结束的时候 另一个线程没到结束条件 也结束了。
				// 因为两个共用了同一个runnbale对象，里面的i的变量的值被共用了。
			}
		}
	}

}

package com.us.demo.timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerTest {
	public static void main(String[] args) {
//		timer1();
		timer2();
	}
	
	public static void timer1(){
		final long timeInterval = 1000l;
		Runnable runnable = new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					System.out.println("Hello1");
					try{
						Thread.sleep(timeInterval);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.run();
	}
	
	public static void timer2(){
		TimerTask timerTask = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello2");
			}
		};
		Timer timer = new Timer();
		long delay = 0l;
		long intervalPeriod = 1 * 1000l;
		timer.scheduleAtFixedRate(timerTask, delay, intervalPeriod);
	}
	
	public static void timer3(){
		Runnable runnable = new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello3");
				
			}
		};
		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
		scheduledExecutorService.scheduleAtFixedRate(runnable, 10, 1, TimeUnit.SECONDS);
	}
	

}

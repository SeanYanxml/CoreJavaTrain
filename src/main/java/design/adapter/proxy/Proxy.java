package design.adapter.proxy;

import design.adapter.common.OnlySource;
import design.adapter.common.OnlySourceable;

public class Proxy implements OnlySourceable{
	
	OnlySourceable onlySource;
	
	public Proxy(){
		super();
		onlySource = new OnlySource();
	}
	
	public void method(){
		before();
		onlySource.method();
		after();
	}
	
	private void before(){
		System.out.println("Before proxy.");
	}
	
	private void after(){
		System.out.println("After proxy.");
	}
	
}

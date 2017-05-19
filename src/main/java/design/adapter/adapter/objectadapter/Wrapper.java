package design.adapter.adapter.objectadapter;

import design.adapter.adapter.common.Source;
import design.adapter.adapter.common.Targetabel;

public class Wrapper implements Targetabel{
	private Source source;
	
	public Wrapper(){
		
	}
	
	public Wrapper(Source source){
		super();
		this.source=source;
	}
	
	public void method1(){
		source.method1();
	}
	
	public void method2(){
		System.out.println("This is the targetable method2!");
	}

}

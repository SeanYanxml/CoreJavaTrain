package design.adapter.decorator;

import design.adapter.common.OnlySourceable;

public class Decorator implements OnlySourceable{
	private OnlySourceable onlySourceAble;
	
	public Decorator(){
		
	}
	
	public Decorator(OnlySourceable onlySourceAble){
		super();
		this.onlySourceAble = onlySourceAble;
	}
	
	public void method(){
		System.out.println("Before method!");
		onlySourceAble.method();
		System.out.println("After method!");
	}

}

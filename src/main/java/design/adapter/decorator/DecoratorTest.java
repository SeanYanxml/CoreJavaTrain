package design.adapter.decorator;

import design.adapter.common.OnlySource;
import design.adapter.common.OnlySourceable;

public class DecoratorTest {
	public static void main(String[] args) {
		OnlySourceable source = new OnlySource(); 
		OnlySourceable obj = new Decorator(source);
		
		obj.method();
	}
}

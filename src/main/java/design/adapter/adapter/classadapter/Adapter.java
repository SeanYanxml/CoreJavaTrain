package design.adapter.adapter.classadapter;

import design.adapter.adapter.common.Source;
import design.adapter.adapter.common.Targetabel;

public class Adapter extends Source implements Targetabel{
	public void method2(){
		System.out.println("This is the targetable method!");
	}

}

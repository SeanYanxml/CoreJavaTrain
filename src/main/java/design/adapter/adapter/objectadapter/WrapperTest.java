package design.adapter.adapter.objectadapter;

import design.adapter.adapter.common.Source;
import design.adapter.adapter.common.Targetabel;

public class WrapperTest {
	public static void main(String[] args) {
		Source source = new Source(); 
	 	Targetabel target = new Wrapper(source);
		target.method1();
		target.method2();
	}

}

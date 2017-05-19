package design.adapter.adapter.interfaceadapter;

import design.adapter.adapter.common.Targetabel;

public class WrapperTest2 {
	public static void main(String[] args) {
		Targetabel target1 = new SourceSub1();
		Targetabel target2 = new SourceSub2();
		
		target1.method1();
		target1.method2();
		
		target2.method1();
		target2.method2();

	}

}

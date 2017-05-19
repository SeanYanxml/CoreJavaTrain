package design.adapter.bridge;

import design.adapter.common.OnlySource;
import design.adapter.common.OnlySourceAnother;

public class BridgeTest {
	public static void main(String[] args) {
//		Bridge bridge = new Bridge();//  因为抽象类 Bridge 不可以创建实例对象 / 所以又包装了一层
		Bridge bridge = new MyBridge();
		
		bridge.SetOnlySourceAble(new OnlySource());
		bridge.method();
	
		bridge.SetOnlySourceAble(new OnlySourceAnother());
		bridge.method();
	}

}

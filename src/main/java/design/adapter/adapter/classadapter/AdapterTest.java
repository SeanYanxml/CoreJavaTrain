package design.adapter.adapter.classadapter;

import design.adapter.adapter.common.Targetabel;

public class AdapterTest {
	public static void main(String[] args) {
		Targetabel target = new Adapter();
		target.method1();// Source 原类的 方法 兼容
		target.method2();// 新方法兼容
	}

}

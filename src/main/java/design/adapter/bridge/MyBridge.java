package design.adapter.bridge;

/**
 * 因为抽象类 Bridge 不可以创建实例对象 / 所以又包装了一层
 * */
public class MyBridge extends Bridge{
	public void method(){
		getOnlySourceAble().method();
	}

}

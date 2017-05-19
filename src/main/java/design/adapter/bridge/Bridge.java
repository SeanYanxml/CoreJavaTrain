package design.adapter.bridge;

import design.adapter.common.OnlySourceable;

/**
 * 貌似 不是抽象类 也可以。/ 可能是为了 实现或不实现部分的方法 （适配器模式的第三种模型）
 * */
public abstract class Bridge {
	
	private OnlySourceable onlySource;
	
	Bridge(){
		
	}
	
	public void method(){
		onlySource.method();
	}
	
	public void SetOnlySourceAble(OnlySourceable onlySource){
		this.onlySource = onlySource;
	}
	
	public OnlySourceable getOnlySourceAble(){
		return onlySource;
	}

}

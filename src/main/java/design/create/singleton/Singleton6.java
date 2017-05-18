package design.create.singleton;

import java.util.Vector;

/**
 * 影子实例 对于单例模式内的属性进行补充
 * 
 * (也就是 开放一个接口 动态更新单例模式内的属性 个人感觉 这边也需要进行多线程的控制?)
 * */
public class Singleton6 {
	
	private static Singleton6 instance = null;
	private Vector properties = null;
	
    /* 私有构造方法，防止被实例化 */  
	private Singleton6(){} 
	
	private Vector getProperties(){
		return properties;
	}
	
	private static synchronized void sysInit(){
		if(null == instance){
			instance = new Singleton6();
		}
	}
	
    /* 静态工程方法，创建实例 */  
	public static Singleton6 getInstance(){
		if(null == instance){
			sysInit();
		}
		return instance;
	}
	
	public void updateProperties(){
		// 可以 替换成带参数的构造函数 动态更新单例模式内的参数信息
		Singleton6 shadow = new Singleton6(); 
		properties = shadow.getProperties();
	}
	
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object resolve(){
		return instance;
	}

}

package design.create.singleton;

public class Singleton {
	
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */ 
	/* 就是 事先不创建实例。用到的时候再创建实例。*/
	/* 另 考虑多线程和 锁的概念*/
	private static Singleton instance = null;
	
    /* 私有构造方法，防止被实例化 */  
	private Singleton(){} 
	
    /* 静态工程方法，创建实例 */  
	public static Singleton getInstance(){
		if(null == instance){
			instance = new Singleton();
		}
		return instance;
	}
	
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object resolve(){
		return instance;
	}

}

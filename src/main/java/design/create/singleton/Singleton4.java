package design.create.singleton;

public class Singleton4 {
		
    /* 私有构造方法，防止被实例化 */  
	private Singleton4(){} 
	
	private static class SingletonFactory{
		private static Singleton4 instance = new Singleton4();
	}
	
    /* 静态工程方法，创建实例 */  
	public static Singleton4 getInstance(){
		return SingletonFactory.instance;
	}
	
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object resolve(){
		return getInstance();
	}

}

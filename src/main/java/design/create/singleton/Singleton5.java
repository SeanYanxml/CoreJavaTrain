package design.create.singleton;

public class Singleton5 {
	
	private static Singleton5 instance = null;
	
    /* 私有构造方法，防止被实例化 */  
	private Singleton5(){} 
	
	private static synchronized void sysInit(){
		if(null == instance){
			instance = new Singleton5();
		}
	}
	
    /* 静态工程方法，创建实例 */  
	public static Singleton5 getInstance(){
		if(null == instance){
			sysInit();
		}
		return instance;
	}
	
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object resolve(){
		return instance;
	}

}

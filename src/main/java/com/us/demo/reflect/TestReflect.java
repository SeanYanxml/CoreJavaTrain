package com.us.demo.reflect;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestReflect implements Serializable{
	private static final long serialVersionUID = -2862585049955236662L;
	private static String property=null;
	public void setProperty(String property){this.property=property;}
	public String getProperty(){return property;}
	public static void main(String []args) throws Exception{
			//method2();
			//method3();
			//method4();
			//method5();
			//method6("123");
			//method7();
			//method8();
			method9();
		
	}
	// 1. 获得完整的类名和包名
	public static void method1(){
        System.out.println("==========method1==========");
		TestReflect test=new TestReflect();
		Class c=test.getClass();
		//获得完整的类名和包名
		System.out.println(c.getName());
		//The Console Line is 
		//"com.us.demo.reflect.TestReflect"
	}
	
	// 2. 实例化Class类对象
	public static void method2() throws ClassNotFoundException{
		Class<?> class1=null;
		Class<?> class2=null;
		Class<?> class3=null;
		class1=Class.forName("com.us.demo.reflect.TestReflect");
		class2=new TestReflect().getClass();
		class3=TestReflect.class;
		System.out.println(class1.getName());
		System.out.println(class2.getName());
		System.out.println(class3.getName());
	}
	
	// 3. 获取一个父类的对象与实现的接口
	public static void method3() throws ClassNotFoundException{
		Class<?> classExp=Class.forName("com.us.demo.reflect.TestReflect");
		Class<?> classFather=classExp.getSuperclass();
		System.out.println("父类"+classFather.getName());
		Class<?> intes[]=classExp.getInterfaces();
		System.out.println("classExp 的接口有:");
		for(Class<?> tmp:intes){
			System.out.println(tmp.getName());
		}
//		java.lang.Object
//		classExp 的接口有:
//		java.io.Serializable
	}
	
	//4. 通过反射机制 获取一个类的对象
	public static void method4() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class<?> class1 = null;
		class1=Class.forName("com.us.demo.reflect.User");
		// 4.1 使用默认构造方法
		User user=(User) class1.newInstance();
		user.setAge(20);
		user.setName("Rollen");
		// 这样会去调用 对象内部的 Tostring() 方法
		System.out.println(user);
		// 4.2 获取构造函数内的构造方法
		Constructor<?> cons[]= class1.getConstructors();
		for(int i=0;i<cons.length;i++){
			Class<?> classzz[]=cons[i].getParameterTypes();
			System.out.print("cons ["+i+"] (");
			for(int j=0;j<classzz.length;j++){
				if(j==(classzz.length-1)){System.out.print(classzz[j].getName());}
				else{System.out.print(classzz[j].getName()+" , ");}
			}
			System.out.println(")");
		}
		user = (User) cons[0].newInstance(10,"Hello");
		System.out.println(user);
		user=(User) cons[1].newInstance("Hello");
		System.out.println(user);
//		age: 20 name:Rollen
//		cons [0] (int , java.lang.String)
//		cons [1] (java.lang.String)
//		cons [2] ()
//		age: 10 name:Hello
//		age: 0 name:Hello
	}
	
	//5. 获取某个类的全部属性
	public static void method5() throws ClassNotFoundException{
		Class<?> classz=Class.forName("com.us.demo.reflect.TestReflect");
        System.out.println("===============本类属性===============");
		Field[] field=classz.getDeclaredFields();
		for(Field tmp :field){
			// 权限修饰符
			int mod=tmp.getModifiers();
			String modify=Modifier.toString(mod);
			// 属性类型
			Class<?> type= tmp.getType();
			System.out.println(" "+modify+" "+ type.getName()+" " + tmp.getName());
		}
		
        System.out.println("==========实现的接口或者父类的属性==========");
        // 取得实现的接口 或 父类的属性
        Field[] field1 = classz.getFields();
        for(Field tmp : field1){
        	int mod =tmp.getModifiers();
        	String modify=Modifier.toString(mod);
        	Class<?>  type=tmp.getClass();
        	System.out.println(" "+modify+" "+type.getName()+" "+ tmp);
        }
	}
	
	//6. 获取某个类的全部方法
	public static void method6(String name) throws ClassNotFoundException{
        System.out.println("==========method6==========");
		Class<?> classzz=Class.forName("com.us.demo.reflect.TestReflect");
		Method methods[] =classzz.getMethods();
		for(Method tmpMethod : methods){
			Class<?> returnType = tmpMethod.getReturnType();
			Class<?> paramTypes[] =tmpMethod.getParameterTypes();
			int mod= tmpMethod.getModifiers();
			System.out.print(Modifier.toString(mod)+" "+returnType.getName()+" ");
			System.out.print(tmpMethod.getName()+" (");
			for(int i=0;i<paramTypes.length;i++){
				//int modType=tmpType.getModifiers();
				if(i==(paramTypes.length-1)){System.out.print(" "+paramTypes[i].getName()+" arg"+i+" ");}
				else System.out.print(" "+paramTypes[i].getName()+" arg"+i+",");
			}
			System.out.print(" )");			
			System.out.print(" throws ");
			// 异常
			Class<?>execs[]=tmpMethod.getExceptionTypes();
			for(int j=0;j<execs.length;j++){
				if(j==(execs.length-1)){
					System.out.print( execs[j].getName() );
				}else{
					System.out.print( execs[j].getName() +", ");
				}
			}
			System.out.println();
		}
	}
	
	public static void method7() throws ClassNotFoundException{
		Class<?> clazz = Class.forName("com.us.demo.reflect.TestReflect");
        Method method[] = clazz.getMethods();
        for (int i = 0; i < method.length; ++i) {
            Class<?> returnType = method[i].getReturnType();
            Class<?> para[] = method[i].getParameterTypes();
            int temp = method[i].getModifiers();
            System.out.print(Modifier.toString(temp) + " ");
            System.out.print(returnType.getName() + "  ");
            System.out.print(method[i].getName() + " ");
            System.out.print("(");
            for (int j = 0; j < para.length; ++j) {
                System.out.print(para[j].getName() + " " + "arg" + j);
                if (j < para.length - 1) {
                    System.out.print(",");
                }
            }
            Class<?> exce[] = method[i].getExceptionTypes();
            if (exce.length > 0) {
                System.out.print(") throws ");
                for (int k = 0; k < exce.length; ++k) {
                    System.out.print(exce[k].getName() + " ");
                    if (k < exce.length - 1) {
                        System.out.print(",");
                    }
                }
            } else {
                System.out.print(")");
            }
            System.out.println();
        }
        // 输出为:
//        public static void  main ([Ljava.lang.String; arg0)
//        public static void  method1 ()
//        public static void  method2 () throws java.lang.ClassNotFoundException 
//        public static void  method7 () throws java.lang.ClassNotFoundException 
//        public static void  method3 () throws java.lang.ClassNotFoundException 
//        public static void  method4 () throws java.lang.ClassNotFoundException ,java.lang.InstantiationException ,java.lang.IllegalAccessException ,java.lang.IllegalArgumentException ,java.lang.reflect.InvocationTargetException 
//        public static void  method5 () throws java.lang.ClassNotFoundException 
//        public static void  method6 (java.lang.String arg0) throws java.lang.ClassNotFoundException 
//        public final void  wait (long arg0,int arg1) throws java.lang.InterruptedException 
//        public final native void  wait (long arg0) throws java.lang.InterruptedException 
//        public final void  wait () throws java.lang.InterruptedException 
//        public boolean  equals (java.lang.Object arg0)
//        public java.lang.String  toString ()
//        public native int  hashCode ()
//        public final native java.lang.Class  getClass ()
//        public final native void  notify ()
//        public final native void  notifyAll ()
	}
	
	public static void method8() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		Class<?> classzz=Class.forName("com.us.demo.reflect.TestReflect");
		Method method1=classzz.getMethod("method1");
		method1.invoke(classzz.newInstance());
		method1=classzz.getMethod("method6", String.class);
		method1.invoke(classzz.newInstance(), "123");
	}
	
	public static void method9() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException{
		Class<?> classzz=Class.forName("com.us.demo.reflect.TestReflect");
		//直接赋值
		TestReflect test=(TestReflect) classzz.newInstance();
		//间接赋值
		Object obj =classzz.newInstance();
		((TestReflect)obj).setProperty("123");
		Field field=classzz.getDeclaredField("property");
		field.setAccessible(true);
		field.set(obj,"reflect");
		System.out.println(field.get(obj));
	}
}
class User{
	private int age;
	private String name;
	public User(){}
	public User(String name){super();this.name=name;}
	public User(int age,String name){super();this.age=age;this.name=name;}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return "age: "+age+" name:"+name;
	}
}

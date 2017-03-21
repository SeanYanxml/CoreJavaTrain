package com.us.demo.extend;


//###16.2 静态方法(待测试)
//* 父类静态方法不能被子类覆盖，但是可以被子类继承；
//* 父类的静态方法不能被子类覆盖为非静态方法 //编译出错
//* 子类可以定义与父类的静态方法同名的静态方法(但是这个不是覆盖 但是也不是重载？)
//* 父类的非静态方法不能被子类覆盖为静态方法；//编译出错
//
//* 即：静态只能被重写和继承。但是静态不能被覆盖为非静态，非静态也不能被覆盖为静态。

class StaticFather{
	public static void method(){
		System.out.println("Father");
	}
	
	public void method2(){
		
	}
}

class StaticSon extends StaticFather{
	public static void method(){
		System.out.println("Son");
//		method();
	}
}

class StaticSon2 extends StaticFather{
	
}

class StaticSon3 extends StaticFather{
//	public  void method(){}
	//父类的静态方法不能被子类覆盖为非静态方法

}

class StaticSon4 extends StaticFather{
//	public  static void method2(){}
	//父类的非静态方法不能被子类覆盖为静态方法

}

public class StaticExtendTest {
	public static void main(String []args){
		StaticSon son = new StaticSon();
		son.method();
		StaticFather father = new StaticSon();
		father.method();

//		StaticSon.method();
//		StaticFather.method();
		StaticSon2.method();//说明父类的静态方法确实被继承了
	}
}



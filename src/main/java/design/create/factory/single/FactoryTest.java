package design.create.factory.single;

import design.create.sender.Sender;

/**
 * Sender工厂测试
 * */

public class FactoryTest {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		if(null != sender){
			sender.send();
		}else{
			System.out.println("Error!");
		}
	}

}

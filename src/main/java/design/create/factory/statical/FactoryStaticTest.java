package design.create.factory.statical;

import design.create.sender.Sender;

public class FactoryStaticTest {
	public static void main(String[] args) {
		Sender smsSender = SendFactoryStatic.produceSms();
		if(null != smsSender){
			smsSender.send();
		}
	}

}

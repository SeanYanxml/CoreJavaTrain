package design.create.abstractfactory;

import design.create.sender.Sender;

public class FactoryTest {
	public static void main(String[] args) {
		Provider provider = new MailProvider();
		Sender mailSender = provider.produce();
		if(null != mailSender ){
			mailSender.send();
		}
	}

}

package design.create.factory.more;

import design.create.sender.Sender;

public class FactoryMoreTest {
	public static void main(String[] args) {
		SendFactoryMore facotry = new SendFactoryMore();
		Sender senderMail = facotry.produceMailSender();
		if(null != senderMail){
			senderMail.send();
		}
	}

}

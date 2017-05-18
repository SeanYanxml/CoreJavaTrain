package design.create.factory.statical;

import design.create.sender.MailSender;
import design.create.sender.Sender;
import design.create.sender.SmsSender;

public class SendFactoryStatic {
	
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}

}

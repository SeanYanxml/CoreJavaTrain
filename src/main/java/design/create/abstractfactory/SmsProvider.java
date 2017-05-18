package design.create.abstractfactory;

import design.create.sender.Sender;
import design.create.sender.SmsSender;

public class SmsProvider implements Provider{
	public Sender produce(){
		return new SmsSender();
	}

}

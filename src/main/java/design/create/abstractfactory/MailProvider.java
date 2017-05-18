package design.create.abstractfactory;

import design.create.sender.MailSender;
import design.create.sender.Sender;

public class MailProvider implements Provider{
	public Sender produce(){
		return new MailSender();
	}

}

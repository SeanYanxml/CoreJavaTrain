package design.create.factory.more;

import design.create.sender.MailSender;
import design.create.sender.Sender;
import design.create.sender.SmsSender;

/**
 * 具体类别的工厂类方法 
 * 不再根据传递的值进行判断了
 * */
public class SendFactoryMore {
	
	public Sender produceMailSender(){
		return new MailSender();
	}
	
	public Sender produceSmsSender(){
		return new SmsSender();
	}

}

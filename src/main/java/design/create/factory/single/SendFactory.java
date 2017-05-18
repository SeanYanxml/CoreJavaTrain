package design.create.factory.single;

import design.create.sender.MailSender;
import design.create.sender.Sender;
import design.create.sender.SmsSender;

public class SendFactory {
	
	/**
	 * Sender() 接口的工厂类
	 * */
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("Please input the right type !");
			return null;
		}
	}

}

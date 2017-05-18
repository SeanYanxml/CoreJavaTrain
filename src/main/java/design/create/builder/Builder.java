package design.create.builder;

import java.util.ArrayList;
import java.util.List;

import design.create.sender.MailSender;
import design.create.sender.Sender;
import design.create.sender.SmsSender;

public class Builder {
	
	private List<Sender> list = new ArrayList<Sender>();
	
	private void produceMailSenderList(int count){
		for(int i=0; i<count;i++){
			list.add(new MailSender());
		}
	}

	private void produceSMSSenderList(int count){
		for(int i = 0; i < count ;i++){
			list.add(new SmsSender());
		}
	}
}

package design.action.command;

public class MyCommand implements Command{

	private Receiver receiver;
	public MyCommand(){
		super();
	}
	public MyCommand(Receiver receiver){
		super();
		this.receiver = receiver;
	}
	public Receiver getReceiver(){
		return receiver;
	}
	public void setReceiver(Receiver receiver){
		this.receiver = receiver; 
	}
	public void exec() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}

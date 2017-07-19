package design.action.command;

public class Invoker {
	private Command command;
	public Invoker(){}
	public Invoker(Command command){this.command=command;}
	public void setCommand(Command command){
		this.command = command;
	}
	public Command getCommand(){
		return this.command;
	}
	public void action(){
		command.exec();
	}
}

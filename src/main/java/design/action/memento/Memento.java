package design.action.memento;

public class Memento {
	private String value;
	public Memento(){}
	public Memento(String value){this.value=value;}
	public  void setValue(String value){this.value=value;}
	public String getValue(){return value;}
}

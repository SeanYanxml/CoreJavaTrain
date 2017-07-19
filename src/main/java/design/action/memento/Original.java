package design.action.memento;

public class Original {
	private String value;
	public Original(){}
	public Original(String value){this.value=value;}
	public void setValue(String value){this.value=value;}
	public String getValue(){return value;}
	public Memento createNewMemento(){return new Memento(value);}
	public Memento createNewMemento(String value){return new Memento(value);}
	public void restoreMemento(Memento memento){this.value=memento.getValue();}
}

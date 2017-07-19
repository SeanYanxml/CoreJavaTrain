package design.action.memento;

public class Storage {
	private Memento memento;
	public Storage(){}
	public Storage(Memento memento){this.memento=memento;}
	public void setMemento(Memento memento){this.memento = memento;}
	public Memento getMemento(){return memento;}
}

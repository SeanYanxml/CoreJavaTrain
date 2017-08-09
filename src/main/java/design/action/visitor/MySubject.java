package design.action.visitor;

public class MySubject implements Subject{

	public void accept(Visitor vistor) {
		vistor.visit(this);		
	}

	public String getSubject() {
		return "Hello";
	}

}

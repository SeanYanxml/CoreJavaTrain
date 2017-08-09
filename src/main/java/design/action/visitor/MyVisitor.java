package design.action.visitor;

public class MyVisitor implements Visitor{

	public void visit(Subject subject) {
		System.out.println("Visit: "+ subject.getSubject());
	}
	

}

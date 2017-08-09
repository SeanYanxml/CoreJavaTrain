package design.action.mediator;

public class MediatorTest {
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMeditor();
		mediator.workAll();
	}
}

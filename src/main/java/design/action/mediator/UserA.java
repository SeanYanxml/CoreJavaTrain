package design.action.mediator;

public class UserA extends User{
	
	public UserA(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("User A exec!");	
	}

}

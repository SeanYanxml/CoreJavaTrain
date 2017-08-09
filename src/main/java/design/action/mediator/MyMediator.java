package design.action.mediator;

public class MyMediator implements Mediator{
	private UserA userA;
	private UserB userB;
	
	public UserA getUserA(){
		return userA;
	}
	
	public UserB getUserB(){
		return userB;
	}
	
	public void createMeditor() {
		userA = new UserA(this);
		userB = new UserB(this);
	}
	public void workAll() {
		userA.work();
		userB.work();
	}

}

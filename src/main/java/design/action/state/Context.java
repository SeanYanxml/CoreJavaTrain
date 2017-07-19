package design.action.state;

public class Context {
	private State state;
	public Context(){super();}
	public Context(State state){super();this.state=state;}
	public void method(){
		if(state.getValue().equals("state1")){
			state.method1();
		}else if(state.getValue().equals("state2")){
			state.method2();
		}
	}

}

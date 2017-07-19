package design.action.state;

public class StateTest {
	public static void main(String[] args) {
		State state =  new State();
		Context context = new Context(state);
		//  第一种状况
		state.setValue("state1");
		context.method();
		// 第二种状况
		state.setValue("state2");
		context.method();

	}
}

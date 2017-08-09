package design.action.interpreter;

public class InterpreterTest {
	public static void main(String[] args) {
		int result1 = new Minus().interpret(new Context(1, 2));
		int result2 = new Plus().interpret(new Context(1, 2));
		System.out.println("1 Minus 2 :"+result1);
		System.out.println("1 Plus  2 :"+result2);
	}

}

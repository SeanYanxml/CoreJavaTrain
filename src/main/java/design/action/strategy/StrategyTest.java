package design.action.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		String exp = "8+2";
		ICalculator calculator = new Plus();
		System.out.println(exp + " = " + calculator.calculate(exp));
	}

}

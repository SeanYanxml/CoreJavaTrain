package design.action.template;

public class TemplateTest {
	
	public static void main(String[] args) {
		String exp = "8+2";
		TemplateCalculator template = new Plus();
		System.out.println(exp + " = " + template.calculator(exp, "\\+"));
	}

}

package design.action.template;

public abstract class TemplateCalculator {
	
    /*主方法，实现对本类其它方法的调用*/  
	public final int calculator(String exp, String opt){
		int arrayInt[] = split(exp, opt);
		return calculator(arrayInt[0], arrayInt[1]);
	}
	
    /*被子类重写的方法*/  
	abstract public int calculator(int number1, int number2);
	
	public int[] split(String exp, String opt){
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2]; 
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}

}

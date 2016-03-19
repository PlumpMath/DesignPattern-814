package strategy;

public class Minus extends HelperCalculate implements Calculator {
	@Override
	public int Calculate(String exp) {
		int arrayInt[] = split(exp,"-");
		return arrayInt[0]-arrayInt[1];
	}
}

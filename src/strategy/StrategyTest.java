package strategy;

public class StrategyTest {
	public static void main(String[] args){
		Calculator calculator = new Plus();
		int result = calculator.Calculate("1+2");
		System.out.println(result);
	}
}

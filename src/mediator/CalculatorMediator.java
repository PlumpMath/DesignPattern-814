package mediator;

public class CalculatorMediator extends Mediator {
	public CalculatorMediator(Digit unit, Digit decade) {
		super(unit, decade);
	}
	@Override
	public void executeCarry() {
		unit.number -= 10;
		decade.number++;
	}
	@Override
	public void executeBorrow() {
		unit.number += 10;
		decade.number--;
	}
}

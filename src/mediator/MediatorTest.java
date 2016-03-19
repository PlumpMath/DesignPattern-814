package mediator;

public class MediatorTest {
	public static void main(String[] args){
		Digit unit = new Unit(8);
		Digit decade = new Decade(1);
		Mediator mediator = new CalculatorMediator(unit, decade);
		unit.number += 5;
		if(unit.number>10){
			unit.carry(mediator);
		}
		System.out.println("result is " + decade.number + unit.number);
		unit.number -= 5;
		if(unit.number<0){
			unit.borrow(mediator);
		}
		System.out.println("result is " + decade.number + unit.number);
	}
}

package mediator;

public class Unit extends Digit {
	public Unit(int number){
		this.number = number;
	}
	public void carry(Mediator mediator){
		mediator.executeCarry();
	}
	public void borrow(Mediator mediator){
		mediator.executeBorrow();
	}
}

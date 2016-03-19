package mediator;

public class Decade extends Digit {
	public Decade(int number){
		this.number = number;
	}
	public void carry(Mediator mediator){
		mediator.executeCarry();
	}
	public void borrow(Mediator mediator){
		mediator.executeBorrow();
	}
}

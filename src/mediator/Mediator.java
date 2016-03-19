package mediator;

public abstract class Mediator {
	Digit unit;
	Digit decade;
	public Mediator(Digit unit, Digit decade){
		this.unit = unit;
		this.decade = decade;
	}
	public abstract void executeCarry();
	public abstract void executeBorrow();
}

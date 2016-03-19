package mediator;

public abstract class Digit {
	int number;
	public abstract void carry(Mediator mediator);
	public abstract void borrow(Mediator mediator);
}

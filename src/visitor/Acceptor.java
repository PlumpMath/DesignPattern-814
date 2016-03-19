package visitor;

public abstract class Acceptor {
	public abstract void accept(Visitor visitor);
	public abstract void doSomething();
}

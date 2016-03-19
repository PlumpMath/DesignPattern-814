package visitor;

public class Acceptor1 extends Acceptor {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	@Override
	public void doSomething() {
		System.out.println("Accepter1 has accepted visitor");
	}
}

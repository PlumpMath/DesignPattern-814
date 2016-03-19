package visitor;

public class Acceptor2 extends Acceptor {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	@Override
	public void doSomething() {
		System.out.println("Accepter2 has accepted visitor");
	}
}

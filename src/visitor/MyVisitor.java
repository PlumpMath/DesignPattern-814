package visitor;

public class MyVisitor extends Visitor {
	public void visit(Acceptor acceptor){
		acceptor.doSomething();
	}
}

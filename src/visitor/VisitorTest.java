package visitor;

public class VisitorTest {
	public static void main(String[] args){
		Visitor visitor = new MyVisitor();
		Acceptor acceptor = new Acceptor1();
		acceptor.accept(visitor);
		acceptor = new Acceptor2();
		acceptor.accept(visitor);
	}
}

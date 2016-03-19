package builder;

public class BuilderTest {
	public static void main(String[] args){
		ComputerDirector computerDirector = new ComputerDirector();
		DellBuilder dellBuilder = new DellBuilder();
		Computer dell = computerDirector.BuilderComputer(dellBuilder);
		AppleBuilder appleBuilder = new AppleBuilder();
		Computer apple = computerDirector.BuilderComputer(appleBuilder);
	}
}

package facade;

public class FacadeTest {
	public static void main(String[] args){
		WorkFlow computer = new Computer();
		computer.Startup();
		computer.Shutdown();
	}
}

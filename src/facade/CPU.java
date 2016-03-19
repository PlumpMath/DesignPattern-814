package facade;

public class CPU implements WorkFlow {
	@Override
	public void Startup() {
		System.out.println("CPU start up");
	}
	@Override
	public void Shutdown() {
		System.out.println("CPU shutdown");
	}
	public void restart(){
		System.out.println("CPU restart");
	}
}

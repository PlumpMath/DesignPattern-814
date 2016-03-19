package facade;

public class Memory implements WorkFlow {
	@Override
	public void Startup() {
		System.out.println("Memory start up");
	}
	@Override
	public void Shutdown() {
		System.out.println("Memory shutdown");
	}
	public void clear(){
		System.out.println("Memory clear");
	}
}

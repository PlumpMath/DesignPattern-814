package facade;

public class Disk implements WorkFlow {
	@Override
	public void Startup() {
		System.out.println("Disk start up");
	}
	@Override
	public void Shutdown() {
		System.out.println("Disk shutdown");
	}
}

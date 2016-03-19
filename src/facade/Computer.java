package facade;

public class Computer implements WorkFlow {
	private WorkFlow cpu;
	private WorkFlow memory;
	private WorkFlow disk;
	public Computer(){
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
	@Override
	public void Startup(){
		System.out.println("computer start up");
		cpu.Startup();
		memory.Startup();
		disk.Startup();
		System.out.println("computer start up finished");
	}
	@Override
	public void Shutdown(){
		System.out.println("computer shutdown");
		cpu.Shutdown();
		memory.Shutdown();
		disk.Shutdown();
		System.out.println("computer shutdown completed");
	}
}

package observer;

public class Guarder extends Watcher{
	public Guarder(Watched watched){
		super(watched);
	}
	@Override
	public void updatePull(Watched watched) {
		System.out.println("Guarder looks at watched Transporter");
		System.out.println("pull update money " + watched.getChanged());
	}
	@Override
	public void updatePush(int money) {
		System.out.println("Guarder looks at watched Transporter");
		System.out.println("push update money " + money);
	}
}

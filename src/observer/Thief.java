package observer;

public class Thief extends Watcher {
	public Thief(Watched watched){
		super(watched);
	}
	@Override
	public void updatePull(Watched watched) {
		System.out.println("Thief looks at watched Transporter");
		System.out.println("pull update money " + watched.getChanged());
	}
	@Override
	public void updatePush(int money) {
		System.out.println("Thief looks at watched Transporter");
		System.out.println("push update money " + money);
	}
}

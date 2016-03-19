package observer;

public class Police extends Watcher {
	public Police(Watched watched){
		super(watched);
	}
	@Override
	public void updatePull(Watched watched) {
		System.out.println("Police looks at watched Transporter");
		System.out.println("pull update money " + watched.getChanged());
	}
	@Override
	public void updatePush(int money) {
		System.out.println("Police looks at watched Transporter");
		System.out.println("push update money " + money);
	}
}

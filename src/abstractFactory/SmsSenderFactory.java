package abstractFactory;

public class SmsSenderFactory implements Factory {
	@Override
	public Sender CreateSender() {
		return new SmsSender();
	}
}

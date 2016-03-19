package abstractFactory;

public class MailSenderFactory implements Factory {
	@Override
	public Sender CreateSender() {
		return new MailSender();
	}
}

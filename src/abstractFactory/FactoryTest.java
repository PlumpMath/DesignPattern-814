package abstractFactory;

public class FactoryTest {
	public static void main(String[] args) {
		Factory factory = new MailSenderFactory();
		Sender sender = factory.CreateSender();
		sender.Send();
		factory = new SmsSenderFactory();
		sender = factory.CreateSender();
		sender.Send();
	}
}

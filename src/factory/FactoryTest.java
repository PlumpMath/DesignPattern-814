package factory;

public class FactoryTest {
	public static void main(String[] args) {  
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.CreateSender("sms");
		sender.Send();
		sender = factory.CreateSender("mail");
		sender.Send();
		
		sender = factory.CreateMailSender();
		sender.Send();
		sender = factory.CreateSmsSender();
		sender.Send();
		
		sender = SenderFactory.CreateMailSender();
		sender.Send();
		sender = SenderFactory.CreateSmsSender();
		sender.Send();
	}
}

package factory;

public class SenderFactory {
	public Sender CreateSender(String type){
		if(type.equals("mail"))
			return new MailSender();
		else if(type.equals("sms"))
			return new SmsSender();
		else{
			System.out.println("type is not exist!");
			return null;
		}
	}
	
	public static Sender CreateMailSender(){
		return new MailSender();
	}
	
	public static Sender CreateSmsSender(){
		return new SmsSender();
	}
}

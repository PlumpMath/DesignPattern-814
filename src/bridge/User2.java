package bridge;

public class User2 extends User {
	String ConnectTime;
	@Override
	public String GetPara() {
		System.out.println("user2 is connecting");
		return pwd;
	}
}

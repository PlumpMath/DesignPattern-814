package bridge;

public class User1 extends User {
	@Override
	public String GetPara() {
		System.out.println("user1 is connecting");
		return pwd;
	}
}

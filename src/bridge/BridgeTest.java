package bridge;

public class BridgeTest {
	public static void main(String[] args){
		User user1 = new User1();
		user1.name = "user1";
		User user2 = new User2();
		user2.name = "user2";
		Database database1 = new Database1(user2);
		Database database2 = new Database1(user1);
		database1.ConnectDatabase();
		database2.ConnectDatabase();
	}
}

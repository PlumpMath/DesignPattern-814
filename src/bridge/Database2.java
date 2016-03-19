package bridge;

public class Database2 extends Database {
	public Database2(User user){
		this.user = user;
	}
	@Override
	public void ConnectDatabase() {
		initialize();
		String para = user.GetPara();
		System.out.println("execute connect query for " + user.name + " with Para " + para + " to connect database2");
	}
	public void initialize(){
		System.out.println("initialize database2");
	}
}

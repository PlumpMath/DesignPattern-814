package flyweight;

public abstract class Connection {
	String command;
	String type;
	String url;
	String driverClassName;
	String userName;
	String passWord;
	public void ExecuteCommand(){
		System.out.println("execute " + command);
	}
}

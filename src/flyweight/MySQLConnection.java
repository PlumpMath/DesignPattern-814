package flyweight;

public class MySQLConnection extends Connection {
	public MySQLConnection(String url, String driver, String usr, String pwd){
		this.url = url;
		this.driverClassName = driver;
		this.userName = usr;
		this.passWord = pwd;
	}
}

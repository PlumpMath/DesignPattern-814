package flyweight;

import java.util.HashMap;

public class ConnectPoolFactory {
	private HashMap<String, Connection> connectPool;
	private int poolSize;
	public Connection getConnection(String type, String url, String driver, String usr, String pwd){
		String command = url + " -u" + usr + " -p" + pwd;
		Connection con = connectPool.get(command);
		if(con==null){
			con = CreateConnection(type, url, driver, usr, pwd);
			connectPool.put(command, con);
			poolSize++;
		}
		return con;
	}
	public int getPoolSize(){
		return poolSize;
	}
	public Connection CreateConnection(String type, String url, String driver, String usr, String pwd){
		Connection con = null;
		if(type.equals("MySQL")){
			con = new MySQLConnection(url, driver, usr, pwd);
			con.type = type;
		}
		return con;
	}
}

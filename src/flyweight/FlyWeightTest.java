package flyweight;

public class FlyWeightTest {
	public static void main(String[] args){
		ConnectPoolFactory connect = new ConnectPoolFactory();
		Connection con1 = connect.CreateConnection("MySQL", "url", "driver", "usr1", "pwd1");
		Connection con2 = connect.CreateConnection("MySQL", "url", "driver", "usr2", "pwd2");
		Connection con3 = connect.CreateConnection("MySQL", "url", "driver", "usr1", "pwd1");
		con1.ExecuteCommand();
		con2.ExecuteCommand();
		con3.ExecuteCommand();
		System.out.println(connect.getPoolSize());		
	}
}

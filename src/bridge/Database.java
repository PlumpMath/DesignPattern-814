package bridge;

public abstract class Database {
	User user;
	abstract public void ConnectDatabase();
	abstract public void initialize();
}

package observer;

public abstract class Watcher {
	Watched watched;
	public Watcher(Watched watched){
		this.watched = watched;
	}
	public abstract void updatePull(Watched watched);
	public abstract void updatePush(int money);
}

package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Watched {
	int money = 1;
	List<Watcher> watcherList = new ArrayList<Watcher>();
	public abstract void addWatcher(Watcher watcher);
	public abstract void removeWatcher(Watcher watcher);
	public abstract void notifyWatcher();
	public abstract int getChanged();
}

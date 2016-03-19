package observer;

public class Transporter extends Watched {
	@Override
	public void addWatcher(Watcher watcher) {
		watcherList.add(watcher);
	}
	@Override
	public void removeWatcher(Watcher watcher) {
		watcherList.remove(watcher);
	}
	@Override
	public void notifyWatcher() {
		for(Watcher watcher : watcherList){
			watcher.updatePull(this);
		}
		for(Watcher watcher : watcherList){
			watcher.updatePush(money);
		}
	}
	@Override
	public int getChanged() {
		return money;
	}
}

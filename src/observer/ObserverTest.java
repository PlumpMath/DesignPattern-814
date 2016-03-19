package observer;

public class ObserverTest {
	public static void main(String[] args){
		Watched transporter = new Transporter();
		Watcher guarder = new Guarder(transporter);
		Watcher thief = new Thief(transporter);
		Watcher police = new Police(transporter);
		transporter.addWatcher(guarder);
		transporter.addWatcher(thief);
		transporter.addWatcher(police);
		transporter.money++;
		transporter.notifyWatcher();
	}
}

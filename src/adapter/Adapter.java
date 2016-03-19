package adapter;

public class Adapter extends Socket implements Plug {
	@Override
	public void MethodPlug() {
		super.MethodSocket();
	}
}

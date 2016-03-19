package adapter;

public class AdapterObject implements Plug {
	private Socket source;
	public AdapterObject(Socket source){
		super();
		this.source = source;
	}
	@Override
	public void MethodPlug() {
		source.MethodSocket();
	}
}

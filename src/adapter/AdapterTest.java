package adapter;

public class AdapterTest {
	public static void main(String[] args){
		Plug newPlug = new Adapter();
		newPlug.MethodPlug();
		
		Socket source = new Socket();
		Plug plugObject = new AdapterObject(source);
		plugObject.MethodPlug();
		
		Adapter1 adapter1 = new Adapter1();
		adapter1.MethodPlug();
		Adapter2 adapter2 = new Adapter2();
		adapter2.MethodNew();
	}
}

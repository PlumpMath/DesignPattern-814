package proxy;

public class ProxyTest {
	public static void main(String[] args){
		Person person = new Person();
		BuyCar proxy = new Proxy(person);
		proxy.BuyMyCar();
	}
}

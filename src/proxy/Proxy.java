package proxy;

public class Proxy implements BuyCar {
	private BuyCar buyCar;
	public Proxy(BuyCar buyCar){
		this.buyCar = buyCar;
	}
	@Override
	public void BuyMyCar() {
		AppointSeller();
		buyCar.BuyMyCar();
		DeliverCar();
	}
	private void AppointSeller(){
		System.out.println("make an appointment with car seller");
	}
	private void DeliverCar(){
		System.out.println("deliver car to Buyer");
	}
}

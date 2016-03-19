package template;

public abstract class TurnOnDevice {
	public void TurnOn(){
		PowerOn();
		HardwareOn();
		SoftwareOn();
		ShowSignal();	
	}
	public void PowerOn(){
		System.out.println("press button");
	}
	public abstract void HardwareOn();
	public abstract void SoftwareOn();
	public abstract void ShowSignal();
}

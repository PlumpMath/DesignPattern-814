package template;

public class TurnOnRadio extends TurnOnDevice {
	@Override
	public void HardwareOn() {
		System.out.println("transistor On");
	}
	@Override
	public void SoftwareOn() {
		System.out.println("doing nothing");
	}
	@Override
	public void ShowSignal() {
		System.out.println("broadcast");
	}
}

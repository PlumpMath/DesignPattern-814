package template;

public class TurnOnComputer extends TurnOnDevice {
	@Override
	public void HardwareOn() {
		System.out.println("CPU and Memory On");
	}
	@Override
	public void SoftwareOn() {
		System.out.println("Operating System On");
	}
	@Override
	public void ShowSignal() {
		System.out.println("show on screen");
	}
}

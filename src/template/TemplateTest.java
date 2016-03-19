package template;

public class TemplateTest {
	public static void main(String[] args){
		TurnOnDevice turnon = new TurnOnComputer();
		turnon.TurnOn();
		turnon = new TurnOnRadio();
		turnon.TurnOn();
	}
}

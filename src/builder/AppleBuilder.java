package builder;

public class AppleBuilder implements ComputerBuilder {
	Computer computer;
	public AppleBuilder(){
		computer = new Apple();
	}
	@Override
	public void BuildMouse() {
		computer.mouse="Apple Mouse";
	}
	@Override
	public void BuildKeyBoard() {
		computer.keyBoard="Apple KeyBoard";
	}
	@Override
	public void BuildMonitor() {
		computer.monitor="Apple Monitor";
	}
	@Override
	public void BuildHost() {
		computer.Host="Apple Host";
	}
	@Override
	public Computer BuildComputer() {
		return computer;
	}
}

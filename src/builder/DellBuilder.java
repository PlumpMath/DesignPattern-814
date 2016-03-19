package builder;

public class DellBuilder implements ComputerBuilder {
	Computer computer;
	public DellBuilder(){
		computer = new Dell();
	}
	@Override
	public void BuildMouse() {
		computer.mouse = "Dell Mouse";
	}
	@Override
	public void BuildKeyBoard() {
		computer.keyBoard = "Dell KeyBoard";
	}
	@Override
	public void BuildMonitor() {
		computer.monitor = "Dell Monitor";
	}
	@Override
	public void BuildHost() {
		computer.Host = "Dell Host";
	}
	@Override
	public Computer BuildComputer() {
		return computer;
	}
}

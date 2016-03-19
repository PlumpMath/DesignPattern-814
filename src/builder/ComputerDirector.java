package builder;

public class ComputerDirector {
	public Computer BuilderComputer(ComputerBuilder CBuilder){
		CBuilder.BuildMouse();
		CBuilder.BuildKeyBoard();
		CBuilder.BuildMonitor();
		CBuilder.BuildHost();
		return CBuilder.BuildComputer();
	}
}

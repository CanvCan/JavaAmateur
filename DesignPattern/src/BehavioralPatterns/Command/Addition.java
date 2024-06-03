package BehavioralPatterns.Command;

public class Addition implements Command {
	
	@Override
	public String execute(int a, int b) {
		int result = a + b;
		return "Addition results: " + result;
	};
	
}
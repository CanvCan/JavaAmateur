package BehavioralPatterns.Command;

public class Division implements Command {
	
	@Override
	public String execute(double a, double b) {
		double result = a / b;
		return "Division results: " + result;
	};

}

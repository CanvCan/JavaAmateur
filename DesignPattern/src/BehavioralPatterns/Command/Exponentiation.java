package BehavioralPatterns.Command;

public class Exponentiation implements Command {
	
	@Override
	public String execute(double a, double b) {
		double result = Math.pow(a, b);
		return "Exponentiation results: " + result;
	};


}
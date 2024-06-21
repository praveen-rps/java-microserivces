package junitdemoproject;

public class DemoService {
	
	public void performAction(String input) {
		if (input == null || input.isEmpty()) {
			throw new NumberFormatException("Number format exception");
		}
	}

}

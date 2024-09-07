package week5;

public class App {

	public static void main(String[] args) {
		
		// Instantiate each logger type
		logger astLogger = new AsteriskLogger();
		logger spcLogger = new SpacedLogger();
		
		String testString = "Hello";
		
		System.out.println("Asterisk Logger Log Method:");
		astLogger.log(testString);
		System.out.println();
		
		System.out.println("Asterisk Logger Error Method:");
		astLogger.error(testString);
		System.out.println();
		
		System.out.println("Spaced Logger Log Method:");
		spcLogger.log(testString);
		System.out.println();
		
		System.out.println("Spaced Logger Error Method:");
		spcLogger.error(testString);
		System.out.println();
		
	}

}

package week5;

public class AsteriskLogger implements logger {

	int astBuffer = 3;
	
	@Override
	public void log(String msg) {
		System.out.println("*".repeat(astBuffer) + msg + "*".repeat(astBuffer));
	}

	@Override
	public void error(String msg) {
		int lengthMsg = msg.length();
		
		String ErrorMsg = "ERROR: ";
		String outerLine = "*".repeat(lengthMsg + ErrorMsg.length() + astBuffer*2);
		String innerLine = "*".repeat(astBuffer) + ErrorMsg + msg + "*".repeat(astBuffer);
		System.out.println(outerLine);
		System.out.println(innerLine);
		System.out.println(outerLine);
	}

}

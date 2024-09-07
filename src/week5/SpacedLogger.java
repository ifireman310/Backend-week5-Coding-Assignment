package week5;

public class SpacedLogger implements logger {

	@Override
	public void log(String msg) {
		
		// String builder to rewrite the message with spaces in between each char
		StringBuilder newMsg = new StringBuilder();
		
		// Loop over the message, and add spaces after each char
		for (int i = 0; i < msg.length(); i++) {
			
			newMsg.append(msg.charAt(i));
			newMsg.append(" ");
		}
		
		// remove extra space at the end
		newMsg.deleteCharAt(newMsg.length()-1);
		
		// Print message to console
		System.out.println(newMsg.toString());
	}

	@Override
	public void error(String msg) {
		// String builder to rewrite the message with spaces in between each char
		StringBuilder newMsg = new StringBuilder();
		
		newMsg.append("ERROR: ");
		
		// Loop over the message, and add spaces after each char
		for (int i = 0; i < msg.length(); i++) {
			
			newMsg.append(msg.charAt(i));
			newMsg.append(" ");
		}
		
		// remove extra space at the end
		newMsg.deleteCharAt(newMsg.length()-1);
		
		// Print message to console
		System.out.println(newMsg.toString());
	}

}

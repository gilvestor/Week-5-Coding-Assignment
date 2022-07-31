package message;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String msg) {
		System.out.println(buildMessage(msg));
		

	}
	
	private String buildMessage(String msg) {
		StringBuilder b = new StringBuilder();
		
		for(int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			b.append(ch).append(" ");
		}
		
		b.setLength(b.length() -1);
		
		return b.toString();
	}

	@Override
	public void Error(String msg) {
		System.out.println("ERROR: " + buildMessage(msg));
		

	}

}

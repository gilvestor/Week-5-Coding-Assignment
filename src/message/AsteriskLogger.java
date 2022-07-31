package message;

public class AsteriskLogger implements Logger {

	@Override
	public void Log (String msg) {
		System.out.println(buildMessage(msg));
		

	}
	
	private String buildMessage(String msg) {
		return "***" + msg + "***";
	}

	@Override
	public void Error(String msg) {
		String asteriskmsg = buildMessage(msg);
		String stars = "*".repeat(asteriskmsg.length());
		
		System.out.println(stars);
		System.out.println(asteriskmsg);
		System.out.println(stars);
		

	}

}

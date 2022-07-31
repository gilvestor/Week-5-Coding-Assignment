package message;

public class Messenger {

	public static void main(String[] args) {
		
		Logger asterisklogger = new AsteriskLogger();
		Logger spacedlogger = new SpacedLogger();
		
		asterisklogger.Log ("Hello");
		asterisklogger.Error("Error:Hello");
		
		
		
		spacedlogger.Log("Hello");
		spacedlogger.Error("Error:Hello");
		

		
	}

}

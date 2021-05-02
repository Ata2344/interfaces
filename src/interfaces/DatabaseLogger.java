package interfaces;

public class DatabaseLogger implements Logger {

	@Override
	public void addLog(String addMessage) {
		System.out.println("Database loglandý :  " + addMessage);

	}

}

package interfaces;

public class SmsLogger implements Logger {

	@Override
	public void addLog(String addMessage) {
		System.out.println("Sms g�nderildi : " + addMessage);

	}

}

package interfaces;

public class EmailLogger implements Logger {

	@Override
	public void addLog(String addMessage) {
		System.out.println("eMail G�nderildi : " + addMessage);

	}

}

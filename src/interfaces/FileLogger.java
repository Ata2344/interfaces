package interfaces;

public class FileLogger implements Logger {

	@Override
	public void addLog(String addMessage) {
		System.out.println("Dosyaya logland� : " + addMessage);

	}

}

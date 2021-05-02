package interfaces;

public class Utils {
	public static void runLoggers(Logger[] loggers, String addMessage) {

		for (Logger logger : loggers) {
			logger.addLog(addMessage);
		}

	}
}

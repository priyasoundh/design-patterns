package singleton.logManager;

public class LogConfig {
	private static volatile LogConfig instance;

	private String message;

	private LogConfig() {

	}

	public static LogConfig getInstance() {
		if (instance == null) {
			synchronized (LogConfig.class) {
				if (instance == null) {
					instance = new LogConfig();
				}

			}
		}
		return instance;
	}

	public static void log(String message) {
		System.out.println("[LOG]: " + message);
	}
}

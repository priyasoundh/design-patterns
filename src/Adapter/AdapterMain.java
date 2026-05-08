package Adapter;

public class AdapterMain {

	public static void main(String[] args) {
		FileLogger fileLogger = new FileLogger();

		Logger logger = new FileLoggerAdapter(fileLogger);

		logger.log("message");
	}
}

package adapter;

public class AdapterMain {

	public static void main(String[] args) {
		FileLogger fileLogger = new FileLogger();

		Logger logger = new FileLoggerAdapter(fileLogger);
		Logger logger2 = new ConsoleLoggerAdapter();

		logger.log("Payment processed");
		logger2.log("Payment processed");
	}
}

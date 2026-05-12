package Adapter;

public class ConsoleLoggerAdapter implements Logger {

	@Override
	public void log(String message) {
		System.out.println("[CONSOLE]: " + message);
	}

}

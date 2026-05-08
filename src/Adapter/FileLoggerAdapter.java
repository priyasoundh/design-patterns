package Adapter;

public class FileLoggerAdapter implements Logger {
	private FileLogger fileLogger;

	public FileLoggerAdapter(FileLogger fileLogger) {
		this.fileLogger = fileLogger;
	}

	@Override
	public void log(String message) {
		fileLogger.writeToFile("file.txt", message);
	}
}

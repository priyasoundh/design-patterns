package Adapter;

public class FileLogger {
	public void writeToFile(String filename, String content) {
		System.out.println("writing to " + filename + ": " + content);
	}
}

package singleton.logManager;

public class Main {
	public static void main(String[] args) {
		LogConfig.getInstance().log("App started");
		LogConfig.getInstance().log("User logged in");

		LogConfig a = LogConfig.getInstance();
		LogConfig b = LogConfig.getInstance();

		System.out.println(a == b);

	}
}

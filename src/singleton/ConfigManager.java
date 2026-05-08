package singleton;

public class ConfigManager {
	
	private static volatile ConfigManager instance;
	
	private static String env;
	private static String AppName;
	private int maxconnections;
	
	private ConfigManager() {
		this.env = "dev";
		this.AppName = "ConfigManager";
		this.maxconnections = 10;
	}
	
	public static ConfigManager getInstance() {
		if(instance == null) {
			synchronized (ConfigManager.class) {
				if(instance == null) {
					instance = new ConfigManager();
				}
			}
		}
		return instance;
	}
	
	public static String getEnv() {
		return getInstance().env;
	}
	
	public static String getAppName() {
		return getInstance().AppName;
	}
	
	public static int getMaxConnections() {
		return getInstance().maxconnections;
	}

}

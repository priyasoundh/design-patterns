package singleton;

public class SingletonService implements Runnable{

	@Override
	public void run() {
//		DatabaseConnection db = DatabaseConnection.getInstance();
//		DatabaseConnection db2 = DatabaseConnection.getInstance();
//		
//		System.out.println(db == db2);
		
		ConfigManager c1 = ConfigManager.getInstance();
		//ConfigManager c2 = ConfigManager.getInstance();
		
		System.out.println(ConfigManager.getAppName());
		System.out.println(ConfigManager.getMaxConnections());
		System.out.println(ConfigManager.getEnv());
		System.out.println(ConfigManager.getMaxConnections());
	}

}

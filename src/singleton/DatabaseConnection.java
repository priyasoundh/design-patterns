package singleton;

public class DatabaseConnection {
	
	private static volatile DatabaseConnection instance;
	
	private String connectionUrl;
	
	private DatabaseConnection() {
		this.connectionUrl="jdbc:sql";
		System.out.println("db connected");
	}
	
	public static DatabaseConnection getInstance() {
		
		if(instance == null) {
			synchronized (DatabaseConnection.class) {
				if(instance==null) {
					instance = new DatabaseConnection();
				}
			}
			
		}
		return instance;
	}

}
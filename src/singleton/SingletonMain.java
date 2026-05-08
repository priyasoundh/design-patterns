package singleton;

public class SingletonMain {
	
	public static void main(String args[]) {
		Thread t1 = new Thread(new SingletonService());
        t1.start();
        
        Thread t2 = new Thread(new SingletonService());
        t2.start();
	}

}

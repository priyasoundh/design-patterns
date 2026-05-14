package observer;

public class WindowDisplay implements Observer {

	@Override
	public void update(int temperature) {
		System.out.println("window display: " + temperature);
	}

}

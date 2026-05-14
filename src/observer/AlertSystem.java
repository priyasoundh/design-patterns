package observer;

public class AlertSystem implements Observer {

	@Override
	public void update(int temperature) {
		if (temperature > 40) {
			System.out.println("Alert!!! temperature rises above 40");
		}
	}

}

package observer;

public class PhoneDisplay implements Observer {

	@Override
	public void update(int temperature) {
		System.out.println("phone display: " + temperature);
	}

}

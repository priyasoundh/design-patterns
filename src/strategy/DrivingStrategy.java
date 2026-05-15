package strategy;

public class DrivingStrategy implements RouteStrategy {

	private String drivingBy;

	DrivingStrategy(String vehicle) {
		this.drivingBy = vehicle;
	}

	@Override
	public void findRoute(String from, String to) {
		System.out.println("Driving by:" + drivingBy + "from: " + from + " to: " + to);
	}

}

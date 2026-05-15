package strategy;

public class WalkingStrategy implements RouteStrategy {

	@Override
	public void findRoute(String from, String to) {
		System.out.println("Walking from: " + from + " to: " + to);
	}

}

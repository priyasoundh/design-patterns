package strategy;

public class CyclingStrategy implements RouteStrategy {

	@Override
	public void findRoute(String from, String to) {
		System.out.println("Cycling from: " + from + " to: " + to);
	}

}

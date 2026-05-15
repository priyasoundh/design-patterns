package strategy;

public class NavigatorMain {

	public static void main(String[] args) {

		Navigator navigaor = new Navigator();
		navigaor.setRouteStrategy(new DrivingStrategy("CAR"));
		navigaor.findRoute("abc", "def");

		navigaor.setRouteStrategy(new WalkingStrategy());
		navigaor.findRoute("tfg", "pih");

		navigaor.setRouteStrategy(new CyclingStrategy());
		navigaor.findRoute("jvd", "oyv");

		navigaor.setRouteStrategy(new DrivingStrategy("Bike"));
		navigaor.findRoute("gfs", "gde");
	}
}

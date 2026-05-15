package strategy;

public class Navigator {

	private RouteStrategy routeStrategy;

	public void setRouteStrategy(RouteStrategy routeStrategy) {
		this.routeStrategy = routeStrategy;
	}

	public void findRoute(String from, String to) {
		routeStrategy.findRoute(from, to);
	}
}

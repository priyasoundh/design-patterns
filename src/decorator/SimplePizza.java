package decorator;

public class SimplePizza implements Pizza {

	@Override
	public String getDescription() {
		return "Pizza";
	}

	@Override
	public int getCost() {
		return 100;
	}

}

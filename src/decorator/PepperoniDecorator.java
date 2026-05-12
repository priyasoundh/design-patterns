package decorator;

public class PepperoniDecorator extends PizzaDecorator {

	PepperoniDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", pepperoni";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 70;
	}

}

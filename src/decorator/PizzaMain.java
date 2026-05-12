package decorator;

public class PizzaMain {

	public static void main(String[] args) {
		Pizza pizza = new SimplePizza();
		System.out.println(pizza.getDescription() + ": " + pizza.getCost());
		pizza = new CheeseDecorator(pizza);
		System.out.println(pizza.getDescription() + ": " + pizza.getCost());
		pizza = new PepperoniDecorator(pizza);
		System.out.println(pizza.getDescription() + ": " + pizza.getCost());
	}

}

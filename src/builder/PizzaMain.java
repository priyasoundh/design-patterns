package builder;

public class PizzaMain {

	public static void main(String[] args) {
		Pizza p1 = new Pizza.PizzaBuilder("small", "thin").cheese(false).mushrooms(true).build();
		
		Pizza p2 = new Pizza.PizzaBuilder("large", "thick").cheese(true).mushrooms(true).wrapper(false).build();
		
		System.out.println(p1);
		System.out.println(p2);
	}
}

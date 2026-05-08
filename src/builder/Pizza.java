package builder;

public class Pizza {

	private String size;
	private String crust;

	private boolean cheese;
	private boolean wrapper;
	private boolean mushrooms;

	private Pizza(PizzaBuilder builder) {
		this.size = builder.size;
		this.crust = builder.crust;

		this.cheese = builder.cheese;
		this.wrapper = builder.wrapper;
		this.mushrooms = builder.mushrooms;
	}

	@Override
	public String toString() {
		return "Pizza{size=" + size + ", crust=" + crust + ", cheese=" + cheese + ", wrapper=" + wrapper
				+ ", mushrooms=" + mushrooms + "}";
	}

	public static class PizzaBuilder {
		private String size;
		private String crust;

		private boolean cheese;
		private boolean wrapper;
		private boolean mushrooms;

		public PizzaBuilder(String size, String crust) {
			this.size = size;
			this.crust = crust;
		}

		public PizzaBuilder cheese(boolean isCheese) {
			this.cheese = isCheese;
			return this;
		}

		public PizzaBuilder wrapper(boolean isWrapper) {
			this.wrapper = isWrapper;
			return this;
		}

		public PizzaBuilder mushrooms(boolean isMushrooms) {
			this.mushrooms = isMushrooms;
			return this;
		}

		public Pizza build() {
			return new Pizza(this);
		}
	}
}

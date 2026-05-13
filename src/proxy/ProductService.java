package proxy;

public class ProductService {

	public Product getProductById(int id) {
		System.out.println("Getting product from db");
		Product product = new Product();
		product.setValues(id, "name");
		return product;

	}
}

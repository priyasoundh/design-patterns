package proxy;

import java.util.HashMap;
import java.util.Map;

public class CachingProductServiceProxy {

	private ProductService productService;

	public CachingProductServiceProxy(ProductService productService) {
		this.productService = productService;
	}

	Map<Integer, Product> product = new HashMap<>();

	public Product getById(int id) {
		if (product.containsKey(id)) {
			System.out.println("getting from cache");
			return product.get(id);
		}
		Product p = productService.getProductById(id);
		product.put(id, p);
		return p;
	}
}

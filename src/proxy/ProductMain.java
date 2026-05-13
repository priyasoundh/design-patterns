package proxy;

public class ProductMain {

	public static void main(String[] args) {
		CachingProductServiceProxy cachingProductServiceProxy = new CachingProductServiceProxy(new ProductService());

		cachingProductServiceProxy.getById(1);
		cachingProductServiceProxy.getById(1);
		cachingProductServiceProxy.getById(2);
		cachingProductServiceProxy.getById(1);
		cachingProductServiceProxy.getById(2);
	}
}

package facade;

public class InventoryService {

	public boolean checkStock(String item) {
		System.out.println("Checking inventory item: " + item);
		return true;
	}
}

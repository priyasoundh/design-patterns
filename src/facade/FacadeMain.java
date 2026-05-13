package facade;

public class FacadeMain {

	public static void main(String[] args) {
		OnlineOrderFacade onlineOrderFacade = new OnlineOrderFacade(new InventoryService(), new PaymentService(),
				new NotificationService());
		onlineOrderFacade.processOrder("book", 157.8, "priya@gmail.com");
	}

}

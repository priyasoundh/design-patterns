package facade;

public class OnlineOrderFacade {

	private InventoryService inventoryService;
	private PaymentService paymentService;
	private NotificationService notificationService;

	public OnlineOrderFacade(InventoryService inventoryService, PaymentService paymentService,
			NotificationService notificationService) {
		this.inventoryService = inventoryService;
		this.paymentService = paymentService;
		this.notificationService = notificationService;
	}

	public void processOrder(String item, double amount, String email) {
		inventoryService.checkStock(item);
		paymentService.processPayment(amount);
		notificationService.sendconfirmation(email);
	}

}

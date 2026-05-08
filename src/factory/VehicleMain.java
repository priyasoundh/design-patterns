package factory;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.startVehicle("CAR");
		Vehicle bus = VehicleFactory.startVehicle("Bus");
		Vehicle bike = VehicleFactory.startVehicle("Bike");
		
		car.drive();
		bus.drive();
		bike.drive();
	}
}

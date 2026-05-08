package factory;

public class VehicleFactory {

	public static Vehicle startVehicle(String type) {
		
		Vehicle vehicle = null;
		
		switch(type) {
		case "CAR":
			vehicle = new Car();
			break;
		case "Bike":
			vehicle = new Bike();
			break;
		case "Bus":
			vehicle = new Bus();
			break;
		}
		return vehicle;
	}
}

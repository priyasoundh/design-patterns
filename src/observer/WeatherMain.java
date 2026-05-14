package observer;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherService weatherService = new WeatherService();

		weatherService.addObserver(new PhoneDisplay());
		weatherService.addObserver(new WindowDisplay());
		weatherService.addObserver(new AlertSystem());

		weatherService.updateTemperature(39);
		weatherService.updateTemperature(45);
		weatherService.updateTemperature(34);
	}
}

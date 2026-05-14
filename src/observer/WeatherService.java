package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherService implements WeatherStation {

	List<Observer> observers = new ArrayList<>();
	int temperature;

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature);
		}
	}

	public void updateTemperature(int temperature) {
		this.temperature = temperature;
		notifyObservers();
	}

}

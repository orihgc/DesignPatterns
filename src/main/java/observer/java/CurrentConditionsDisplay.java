package observer.java;

import observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
//        if (o instanceof WeatherData) {
//            WeatherData weatherData = (WeatherData) o;
//            this.temperature = weatherData.getTemperature();
//            this.humidity = weatherData.getHumidity();
//            display();
//        }
        temperature=(Float)arg;
        humidity=(Float)arg;
        display();
    }

    public void display() {
        System.out.println("Current Conditions:" + temperature + "F degrees and"
                + humidity + "% humidity");
    }
}

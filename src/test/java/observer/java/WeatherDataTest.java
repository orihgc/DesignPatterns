package observer.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherDataTest {

    @Test
    void setMeasurements() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.deleteObserver(currentConditionsDisplay);
        weatherData.addObserver(currentConditionsDisplay);
        weatherData.setMeasurements(1.1f,2.2f,3.3f);
    }
}
package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 29.03.2016.
 */
public class WeatherStation {
    private int temperature;
    private int humidity;
    private int pressure;

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void stateChanged() {
        for (Observer observer : observers) {
            observer.update(this); // link for itself
        }
        /*currentDisplay.update(temperature, humidity, pressure);
        statisticDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);*/
    }
}

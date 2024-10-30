package exampleTwo.Publisher;

import exampleTwo.Subscriber.Display;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationImpl implements WeatherStation {

    List<Display> displays = new ArrayList<>();
    double temperature = 0;

    public WeatherStationImpl(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void subscribe(Display display) {
        displays.add(display);
    }

    @Override
    public void unsubscribe(Display display) {
        displays.remove(display);
    }

    @Override
    public void notification() {
        for (Display display : displays)
            display.update();
    }

    @Override
    public double getData() {
        return temperature;
    }

    @Override
    public void setData(double temperature) {
        this.temperature = temperature;
        notification();
    }
}

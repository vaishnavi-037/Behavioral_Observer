package exampleTwo.Subscriber;

import exampleTwo.Publisher.WeatherStation;

public class TVDisplay implements Display {
    String name;
    WeatherStation station;

    public TVDisplay(String name, WeatherStation station) {
        this.name = name;
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("TV " + name + " showing weather update " + station.getData());
    }
}

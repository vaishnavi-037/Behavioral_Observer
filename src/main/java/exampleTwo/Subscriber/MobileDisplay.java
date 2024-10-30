package exampleTwo.Subscriber;

import exampleTwo.Publisher.WeatherStation;

public class MobileDisplay implements Display {
    String name;
    WeatherStation station;

    public MobileDisplay(String name, WeatherStation station) {
        this.name = name;
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("Mobile " + name + " showing weather update " + station.getData());
    }
}

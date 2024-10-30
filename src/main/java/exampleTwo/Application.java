package exampleTwo;

import exampleTwo.Publisher.WeatherStation;
import exampleTwo.Publisher.WeatherStationImpl;
import exampleTwo.Subscriber.Display;
import exampleTwo.Subscriber.MobileDisplay;
import exampleTwo.Subscriber.TVDisplay;

public class Application {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStationImpl(32.22);
        Display sonyTV = new TVDisplay("SONY", station);
        Display xiomiTV = new TVDisplay("XIOMI", station);
        Display iPhone = new MobileDisplay("IPHONE", station);
        Display realMe = new MobileDisplay("REALME", station);

        station.subscribe(sonyTV);
        station.subscribe(xiomiTV);
        station.subscribe(iPhone);
        station.subscribe(realMe);

        station.setData(36.57);

        station.unsubscribe(xiomiTV);
        System.out.println();

        station.setData(32.78);
    }
}

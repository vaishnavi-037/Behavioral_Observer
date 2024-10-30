package exampleTwo.Publisher;

import exampleTwo.Subscriber.Display;

public interface WeatherStation {
    void subscribe(Display display);

    void unsubscribe(Display display);

    void notification();

    double getData();

    void setData(double temperature);
}

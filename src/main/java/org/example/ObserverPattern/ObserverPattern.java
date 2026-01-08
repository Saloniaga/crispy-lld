package org.example.ObserverPattern;

public class ObserverPattern {
    public static void main(String[] args) {
        //CREATE OBSERVABLE
        Subject weatherSubject = new WeatherStation();

        //create observers
        Observer mobile1 = new MobileUsers(weatherSubject);
        Observer tv1 = new TVUsers(weatherSubject);

        weatherSubject.register(mobile1);
        weatherSubject.updateData(100);

        weatherSubject.register(tv1);
        weatherSubject.updateData(104);


    }
}

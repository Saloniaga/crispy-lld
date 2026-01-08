package org.example.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observerList=new ArrayList<>();
    private int temperature;

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void remove(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void updateData(int newTemp) {
        temperature = newTemp;
        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        for(Observer o: observerList)
            o.update();
    }

    @Override
    public int getData() {
        return temperature;
    }
}

package org.example.ObserverPattern;

public interface Subject {
    public void register(Observer o);
    public void remove(Observer o);
    public void updateData(int data);
    public void notifySubscribers();
    public int getData();
}

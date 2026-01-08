package org.example.patterns.observer;

public interface Subject {
    public void register(Observer o);
    public void remove(Observer o);
    public void updateData(int data);
    public void notifySubscribers();
    public int getData();
}

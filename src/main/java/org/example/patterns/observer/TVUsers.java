package org.example.patterns.observer;

public class TVUsers implements Observer{

    Subject obj;
    public TVUsers(Subject o){
        obj = o;
    }
    @Override
    public void update() {
        int data = obj.getData();
        System.out.println("TV Users are notified, new temp : "+data);
    }
}

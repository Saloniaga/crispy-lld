package org.example.ObserverPattern;

public class MobileUsers implements Observer{

    Subject obj;
    public MobileUsers(Subject o){
        obj = o;
    }
    @Override
    public void update() {
        int data = obj.getData();
        System.out.println("Mobile Users are notified, new temperature : "+data);

    }
}

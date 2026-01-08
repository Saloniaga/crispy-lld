package org.example.patterns.decorator;

public class BasicCoffee implements BaseComponent{
    @Override
    public String getDescription() {
        return "Serving basic coffee";
    }

    @Override
    public int getPrice() {
        return 100;
    }
}

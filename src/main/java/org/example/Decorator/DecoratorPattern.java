package org.example.Decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        BaseComponent coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());
    }
}

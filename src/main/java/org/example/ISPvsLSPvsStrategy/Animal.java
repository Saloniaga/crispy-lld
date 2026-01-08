package org.example.ISPvsLSPvsStrategy;

public abstract class Animal {
    public void eat(){
        System.out.println("Eating..");
    }
    abstract void fly();
    abstract void swim();
}
class Penguin extends Animal{
    @Override
    public void fly(){
        System.out.println("Can't fly");
        throw new RuntimeException();
    }
    @Override
    void swim() {
        System.out.println("Swimming...");
    }
}
class Sparrow extends Animal{
    @Override
    public void fly(){
        System.out.println("Flying...");
    }
    @Override
    void swim() {
        System.out.println("Doesn't swim");
        throw new RuntimeException();
    }
}

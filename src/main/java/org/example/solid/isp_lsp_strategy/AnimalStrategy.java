package org.example.solid.isp_lsp_strategy;


interface FlyBehavior{
    public void fly();
}
class CantFly implements FlyBehavior{
    public void fly(){
        System.out.println("Cant fly");
    }
}
class CanFly implements FlyBehavior{
    public void fly(){
        System.out.println("Flying...");
    }
}
interface SwimBehavior{
    public void swim();
}
class CantSwim implements SwimBehavior{
    public void swim(){
        System.out.println("Cant swim");
    }
}
class CanSwim implements SwimBehavior{
    public void swim(){
        System.out.println("Swimming...");
    }
}

public abstract class AnimalStrategy {
    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;
    public void eat(){
        System.out.println("Eating..");
    }
    public void fly(){
        flyBehavior.fly();
    }
    public void swim(){
        swimBehavior.swim();
    }
}
class PenguinStrategy extends AnimalStrategy{
    PenguinStrategy(CantFly flyBehavior, CanSwim swimBehavior){
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
    }
}
class SparrowStrategy extends AnimalStrategy{
    SparrowStrategy(CantSwim swimBehavior, CanFly flyBehavior){
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
    }
}

package org.example.solid.isp_lsp_strategy;

public abstract class AnimalISP {
    public void eat(){
        System.out.println("Eating..");
    }
}
interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class PenguinISP extends AnimalISP implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Swimming...");
    }
}
class SparrowISP extends AnimalISP implements Flyable{
    @Override
    public void fly(){
        System.out.println("Flying...");
    }
}


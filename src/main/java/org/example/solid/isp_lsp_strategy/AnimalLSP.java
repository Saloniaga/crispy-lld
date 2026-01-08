package org.example.solid.isp_lsp_strategy;

public abstract class AnimalLSP {
    public void eat(){
        System.out.println("Eating..");
    }
}
class PenguinLSP extends AnimalLSP{
    void swim() {
        System.out.println("Swimming...");
    }
}
class SparrowLSP extends AnimalLSP{
    public void fly(){
        System.out.println("Flying...");
    }
}


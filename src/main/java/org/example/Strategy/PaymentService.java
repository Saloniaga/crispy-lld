package org.example.Strategy;

public class PaymentService {

    public PaymentStrategy strategy;
    PaymentService(PaymentStrategy strategy){
        this.strategy = strategy;
    }
    public void setStrategy(PaymentStrategy newStrategy){
        strategy=newStrategy;
    }
    public void checkout(int amount){
        strategy.checkout(amount);
    }

}

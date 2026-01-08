package org.example.patterns.strategy;

public class CardPayment extends PaymentStrategy{
    @Override
    public void checkout(int amount) {
        System.out.println("Paying by Card: "+amount);
    }
}

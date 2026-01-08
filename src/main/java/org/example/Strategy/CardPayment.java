package org.example.Strategy;

public class CardPayment extends PaymentStrategy{
    @Override
    public void checkout(int amount) {
        System.out.println("Paying by Card: "+amount);
    }
}

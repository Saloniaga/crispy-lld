package org.example.patterns.strategy;

public class UPIPayment extends PaymentStrategy{
    @Override
    public void checkout(int amount) {
        System.out.println("Paying by UPI: "+amount);
    }
}

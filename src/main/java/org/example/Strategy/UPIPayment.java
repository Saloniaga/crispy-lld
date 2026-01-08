package org.example.Strategy;

public class UPIPayment extends PaymentStrategy{
    @Override
    public void checkout(int amount) {
        System.out.println("Paying by UPI: "+amount);
    }
}

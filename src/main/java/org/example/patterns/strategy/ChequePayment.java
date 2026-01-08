package org.example.patterns.strategy;

public class ChequePayment extends PaymentStrategy{
    @Override
    public void checkout(int amount) {
        System.out.println("Paying by Cheque: "+amount);
    }
}

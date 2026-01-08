package org.example.patterns.strategy;

public class main {
    public static void main(String[] args) {
        PaymentService chequeObj = new PaymentService(new ChequePayment());
        chequeObj.checkout(20000);

        PaymentService cardObj = new PaymentService(new CardPayment());
        cardObj.checkout(5000);

        chequeObj.setStrategy(new UPIPayment());
        chequeObj.checkout(100);

    }

}

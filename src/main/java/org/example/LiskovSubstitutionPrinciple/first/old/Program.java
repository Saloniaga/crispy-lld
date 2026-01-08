package org.example.LiskovSubstitutionPrinciple.first.old;

public class Program {
    public static void main(String[] args) {
        BankAccount savings = new Saving();
        savings.withdraw(1200);
        BankAccount fixed = new Fixed();
        fixed.withdraw(100); //this throws an error.
    }
}

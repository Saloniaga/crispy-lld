package org.example.solid.liskov_substitution.first.old;

public class BankAccount {
    protected int amount;
    public void showBalance(){
        System.out.println("Balance: "+amount);
    }
    public void withdraw(int amount){
        System.out.println("you have withdrawn successfully");
    }
}

class Saving extends BankAccount{
    @Override
    public void withdraw(int amount){
        System.out.println("you have withdrawn successfully from savings");
    }
}
class Fixed extends BankAccount{
    @Override
    public void withdraw(int amount){
        System.out.println("you CANNOT withdrawn from Fixed");
        throw new RuntimeException();

        //this will throw error if we create Fixed object.
        // Again child class should only implement or extend the property of parent class.
        // When we replace BankAccount object with Fixed object, throws error.
    }
}

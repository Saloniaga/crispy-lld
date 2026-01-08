package org.example.LiskovSubstitutionPrinciple.first.liskov;

interface Withdrawer{
    void withdraw(int amount);
}
public class BankAccount {
    protected int amount;
    public void showBalance(){
        System.out.println("Balance: "+amount);
    }
    public void deposit(int amount){
        System.out.println("Deposit successful.");
    }
}
class Saving extends BankAccount implements Withdrawer{
    @Override
    public void withdraw(int amount){
        System.out.println("you have withdrawn successfully from savings");
    }
}
class Fixed extends BankAccount{
    private boolean deposited = false;
   public void deposit(int amount){
       if(!deposited){
            this.amount = amount;
            deposited = true;
       }
   }//same thing can be used for deposit!! implement
}


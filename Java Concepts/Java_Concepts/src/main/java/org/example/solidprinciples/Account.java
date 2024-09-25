package org.example.solidprinciples;

//Single Responsibility Principle
public class Account {
    private double balance;
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
  public void withdraw(double amount) {
        if(amount<=balance) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient funds");
        }
  }
}

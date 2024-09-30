package org.example.solidprinciples;

import java.util.logging.Logger;

//Single Responsibility Principle
public class Account {

    private double balance;
    static Logger logger = Logger.getLogger("Account");

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
            logger.info("Insufficient funds");
        }
  }

}

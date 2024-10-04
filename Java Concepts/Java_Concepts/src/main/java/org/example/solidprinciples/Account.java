package org.example.solidprinciples;

import java.util.logging.Logger;

/**
 * {@link Account provide the entity class with methods like get the balance, deposite and withdraw of money}
 * Single responsibility principle is used
 */
public class Account {

    private double balance;
    static Logger logger = Logger.getLogger("Account");

    /**
     * getBalance Used to fetch the balance from the Account
     */
    public double getBalance(){
        return balance;
    }

    /**
     * Deposit is used to add
     * @param amount
     * to the account
     */
    public void deposit(double amount){
        balance+=amount;
    }

    /**
     * Withdraw is used to deduct the
     * @param amount
     * from the account
     */
  public void withdraw(double amount) {

        if(amount<=balance) {
            balance -= amount;
        }
        else {
            logger.info("Insufficient funds");
        }
  }

}

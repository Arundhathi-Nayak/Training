package org.example.testabstract;

abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {//concrete method
        return balance;
    }
}

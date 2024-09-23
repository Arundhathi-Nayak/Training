package org.example.variables;

public class Account {
    private static int totalAccounts=0;
    private double balance;

    public Account(double initialBalance){
        this.balance=initialBalance;
        totalAccounts++;
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public double getBalance() {
        return balance;
    }
}

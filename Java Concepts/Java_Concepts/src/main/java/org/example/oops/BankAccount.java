package org.example.oops;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    private void updateBalance(double amount) {
        this.balance += amount;
    }

    public void deposit(double amount) {
        updateBalance(amount);
    }

    public void withdraw(double amount) {
        updateBalance(-amount);
    }}

package org.example.testabstract;

public class Main {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(1000);
        savings.deposit(200);
        savings.withdraw(150);
        System.out.println("Balance: " + savings.getBalance());
    }
}
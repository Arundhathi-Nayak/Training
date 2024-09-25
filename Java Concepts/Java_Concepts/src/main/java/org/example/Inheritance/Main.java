package org.example.Inheritance;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123456789", "Arundhathi", 1000.0);
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Arundhathi", 1500.0, 2.5);

        System.out.println("Bank Account Details:");
        bankAccount.displayAccountDetails();

        System.out.println("\nSavings Account Details:");
        savingsAccount.displayAccountDetails(); // This will call the overridden method in SavingsAccount
    }
}

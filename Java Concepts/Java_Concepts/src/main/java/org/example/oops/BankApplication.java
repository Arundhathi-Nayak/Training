package org.example.oops;

public class BankApplication {
    public static void main(String[] args) {
        // Instantiate bank
        Bank bank = new Bank("Global Bank", "GB001");

        // Create a transaction
        Transaction transaction = new Transaction("TX123", 250.00);

        // Process the transaction through the bank
        bank.processTransaction(transaction);

        // Create a bank account
        BankAccount account = new BankAccount("AC123", 500.00);
        account.deposit(150.00);
        account.withdraw(100.00);
        System.out.println("Current balance: " + account.getBalance());

        // Create a bank customer
        BankCustomer customer = new BankCustomer("CU123", "John Doe");

        // Create a premier customer
        PremierCustomer premierCustomer = new PremierCustomer("PC123", "Jane Smith", 20000.00);
        premierCustomer.offerPremiumService();
    }
}

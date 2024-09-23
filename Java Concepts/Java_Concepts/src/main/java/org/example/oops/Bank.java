package org.example.oops;

public class Bank {
    private String bankName;
    private String bankCode;  // private member

    Bank(String bankName, String bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    private void logTransaction(Transaction transaction) {
        System.out.println("Logging transaction ID: " + transaction.getTransactionID());
    }

    public void processTransaction(Transaction transaction) {
        logTransaction(transaction);
        System.out.println("Transaction processed for amount: " + transaction.getAmount());
    }

    public String getBankName() {
        return bankName;
    }
}

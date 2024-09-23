package org.example.oops;


class Transaction {
    String transactionID;
    double amount;

    Transaction(String transactionID, double amount) {
        this.transactionID = transactionID;
        this.amount = amount;
    }

    String getTransactionID() {
        return transactionID;
    }

    double getAmount() {
        return amount;
    }

    void printTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID + ", Amount: " + amount);
    }
}
package org.example.variables;

public class StaticBankExample {
    public static void main(String[] args) {
        Account account1 = new Account(1000);
        Account account2 = new Account(1230);
        System.out.println("Total accounts created: " + Account.getTotalAccounts());

    }

}

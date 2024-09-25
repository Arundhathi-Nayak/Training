package org.example.testInterface;

public class OverLoadingDemo {
        private double balance;

        public OverLoadingDemo(double initialBalance) {
            balance = initialBalance;
        }

        // Method to deposit an amount
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }

        // Overloaded method to deposit with an integer amount
        public void deposit(int amount) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }

        // Method to get the current balance
        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {
            OverLoadingDemo account = new OverLoadingDemo(100.0);

            account.deposit(50);       // Calls the method with integer parameter
            account.deposit(25.75);    // Calls the method with double parameter

            System.out.println("Current Balance: " + account.getBalance());
        }


}

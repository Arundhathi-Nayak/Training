package org.example.solidprinciples;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * {@link ConsoleService} is used to show the menu option and take the input from users
 * and Dependency Inversion Principle is used here
 */

public class ConsoleService implements ConsoleInterface {

    static Scanner scanner = new Scanner(System.in);
    static Notification notificationService = new SmsNotification();
    static Account account = new Account();
    static BankService bankService = new BankService(account, notificationService);
    static Logger logger = Logger.getLogger(ConsoleService.class.getName());

    /**
     * This Method is used to display the menu, takes the input and routes it to the respective service method
     * {@return} {@code true} if loop continues and {@code false} if quit
     */

    @Override
    public boolean menu() {

        logger.info("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Quit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> deposit();
            case 2 -> withdraw();
            case 3 -> checkBalance();
            case 4 -> {
                scanner.close();
                return false;
            }
            default -> logger.warning("Wrong Option! Please try Again");
        }
        return true;

    }

    /**
     * This method used to take the input amount to be deposited
     */
    public static void deposit() {
        logger.info("Enter the amount to deposit:");
        double amount = scanner.nextDouble();
        bankService.processDeposit(amount);
    }

    /**
     * This method is used to take the input amount to be deducted
     */
    public static void withdraw() {
        logger.info("Enter the amount to withdraw:");
        double amount = scanner.nextDouble();
        bankService.processWithdrawal(amount);
    }

    /**
     * This Method is used to check the available balance in the account
     */
    public static void checkBalance() {
        logger.info("Final Balance: " + account.getBalance());
    }

}

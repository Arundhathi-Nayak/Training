package org.example.solidprinciples;

import java.util.Scanner;
import java.util.logging.Logger;

//Dependency Inversion Principle
public class ConsoleService implements ConsoleInterface{

    static Scanner scanner=new Scanner(System.in);
    static Notification notificationService = new SmsNotification();
    static Account account = new Account();
    static BankService bankService = new BankService(account, notificationService);
    static Logger logger = Logger.getLogger(ConsoleService.class.getName());


    @Override
    public boolean menu(){

        logger.info("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Quit");
        int choice= scanner.nextInt();
        switch (choice){
            case 1 -> deposit();
            case 2 -> withdraw();
            case 3 -> checkBalance();
            case 4 -> { scanner.close();
                return false;}
            default -> logger.warning("Wrong Option! Please try Again");
        }
        return true;

    }

    public static void deposit(){
        logger.info("Enter the amount to deposit:");
        double amount=scanner.nextDouble();
        bankService.processDeposit(amount);
    }

    public static void withdraw(){
        logger.info("Enter the amount to withdraw:");
        double amount=scanner.nextDouble();
        bankService.processWithdrawal(amount);
    }

    public static void checkBalance(){
        logger.info("Final Balance: " + account.getBalance());
    }

}

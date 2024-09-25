package org.example.solidprinciples;

import java.util.Scanner;

//Dependency Inversion Principle
public class ConsoleService implements ConsoleInterface{
    static Scanner scanner=new Scanner(System.in);
    static Notification notificationService = new SmsNotification();
    static Account account = new Account();
    static BankService bankService = new BankService(account, notificationService);
    @Override
    public void menu(){
        System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Quit");
        int choice= scanner.nextInt();
        switch (choice){
            case 1 -> deposit();
            case 2 -> withdraw();
            case 3 -> checkBalace();
            case 4 -> { scanner.close();
                System.exit(0);}
        }
    }
    public static void deposit(){
        System.out.println("Enter the amount to deposit:");
        double amount=scanner.nextDouble();
        bankService.processDeposit(amount);
    }
    public static void withdraw(){
        System.out.println("Enter the amount to withdraw:");
        double amount=scanner.nextDouble();
        bankService.processWithdrawal(amount);
    }
    public static void checkBalace(){
        System.out.println("Final Balance: " + account.getBalance());
    }
}

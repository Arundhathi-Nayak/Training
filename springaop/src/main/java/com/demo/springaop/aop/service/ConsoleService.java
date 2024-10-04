package com.demo.springaop.aop.service;

import com.demo.springaop.aop.entity.Account;
import com.demo.springaop.aop.repository.BankRepository;
import com.demo.springaop.aop.repository.ConsoleInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleService implements ConsoleInterface {
    Scanner scanner=new Scanner(System.in);
    boolean running = true;
    @Autowired
    BankRepository service=new BankService();
    @Override
    public Boolean displayMenu() {
        System.out.println("1.Create Account\n2.deposit\n3.Withdraw\n4.Check Balance\n5.View ALl Accounts\n6.Exit");
        System.out.println("Please choose an option:");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> createAccount();
                    case 2 -> handleDeposit();
                    case 3 -> handleWithdraw();
                    case 4 -> handleCheckBalance();
                    case 5 -> handleViewAllAccounts();
                    case 6 -> running=false;
                    default -> System.out.println("Invalid option. Please try again.");
                }
            }catch (InputMismatchException inputMismatchException){
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }catch (RuntimeException exception){
                System.out.println("Error: "+exception.getMessage());
            }
            return true;
    }
    private void createAccount() {
        System.out.print("Enter new account ID: ");
        String accountId = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        try {
            service.createAccount(accountId, initialBalance);
            System.out.println("Account created successfully.");
        } catch (RuntimeException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void handleDeposit() {
        System.out.println("Enter account Id: ");
        String accountId=scanner.nextLine();
        System.out.println("Enter amount to deposit: ");
        double amount=scanner.nextDouble();
        scanner.nextLine();
        service.deposit(accountId,amount);
        System.out.println("Amount deposited successfully.");

    }

    public void handleWithdraw() {
        System.out.println("Enter account Id: ");
        String accountId=scanner.nextLine();
        System.out.println("Enter amount to withdraw: ");
        double amount=scanner.nextDouble();
        scanner.nextLine();
        service.withdraw(accountId,amount);
        System.out.println("Amount withdraw successfully.");

    }


    public void handleCheckBalance() {
        System.out.println("Enter account Id: ");
        String accountId=scanner.nextLine();
        System.out.println("Balance: "+service.getBalance(accountId));
    }


    public void handleViewAllAccounts() {
        List<Account> accounts=service.getAllAccounts();
        accounts.forEach(System.out::println);
    }
}

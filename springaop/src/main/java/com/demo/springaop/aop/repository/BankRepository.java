package com.demo.springaop.aop.repository;

import com.demo.springaop.aop.entity.Account;

import java.util.List;

public interface BankRepository {
    void createAccount(String accountId,double amount);
    void deposit(String accountId,double amount);
    void withdraw(String accountId,double amount);
    double getBalance(String accountId);
    List<Account> getAllAccounts();
}

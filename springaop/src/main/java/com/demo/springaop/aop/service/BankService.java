package com.demo.springaop.aop.service;

import com.demo.springaop.aop.entity.Account;
import com.demo.springaop.aop.repository.BankRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BankService implements BankRepository {

    private final Map<String,Account> accountMap=new HashMap<>();


    @Override
    public void createAccount(String accountId, double amount) {
        if(accountMap.containsKey(accountId)){
            throw new RuntimeException("Account Id already exists");

        }
        accountMap.put(accountId,new Account(accountId,amount));
    }

    @Override
    public void deposit(String accountId, double amount) {
        Account account=accountMap.get(accountId);
        if(account==null){
            throw new RuntimeException("Account not found");
        }
        account.setBalance(account.getBalance()+amount);

    }

    @Override
    public void withdraw(String accountId, double amount) {
        Account account=accountMap.get(accountId);
        if(account==null){
            throw new RuntimeException("Account not found");
        }
        if(account.getBalance()<amount){
            throw new RuntimeException("Insufficient balance");
        }
        account.setBalance(account.getBalance()-amount);
    }


    @Override
    public double getBalance(String accountId) {
       Account account=accountMap.get(accountId);
       if(account==null){
           throw new RuntimeException("Account not found");
       }
        assert account != null;
        return account.getBalance();
    }

    @Override
    public List<Account> getAllAccounts() {
        return new ArrayList<>(accountMap.values());
    }
}

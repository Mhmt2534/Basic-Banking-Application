package com.turkcell.repository;

import com.turkcell.entity.BankAccount;

public class BankRepository {

    //Hesap açma
    public void addAccount(BankAccount account) {
        System.out.println("Adding account for " + account.getName() + " " + account.getSurname());
    }

    //Para yatırma
    public void depositMoney(String accountNumber, double amount) {
        System.out.println("Depositing " + amount + "TL to account " + accountNumber);
    }

    //Para çekme
    public void withDrawMoney(String accountNumber, double amount) {
        System.out.println("Withdrawing " + amount + "TL from account " + accountNumber);
    }

    //Para transferi
    public void transferMoney(BankAccount fromAccount, BankAccount toAccount, double amount) {
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
        System.out.println("Transferring " + amount + "TL from account " + fromAccount.getAccountNumber() + " to account " + toAccount.getAccountNumber());
    }


}

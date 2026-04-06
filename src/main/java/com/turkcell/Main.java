package com.turkcell;

import com.turkcell.entity.BankAccount;
import com.turkcell.repository.BankRepository;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1,"123456", "Ahmet", "Yılmaz", 1000);
        BankAccount account2 = new BankAccount(2,"789012", "Mehmet", "Kaya", 1500);


        BankRepository bankRepository = new BankRepository();

        bankRepository.addAccount(account1);
        bankRepository.addAccount(account2);

        bankRepository.depositMoney("123456", 1000);

        bankRepository.withDrawMoney("123456", 500);

        bankRepository.transferMoney(account1, account2, 200);

        System.out.println("Hello world!");
    }


}
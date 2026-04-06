package com.turkcell;

import com.turkcell.repository.BankRepository;

public class Main {
    public static void main(String[] args) {
        BankRepository bankRepository = new BankRepository();

        bankRepository.addAccount("Ahmet", "Yılmaz");

        bankRepository.depositMoney("123456", 1000);

        bankRepository.withDrawMoney("123456", 500);
        
        bankRepository.transferMoney("123456", "789012", 300);

        System.out.println("Hello world!");
    }


}
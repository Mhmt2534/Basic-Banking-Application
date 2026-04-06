package com.turkcell.repository;

public class BankRepository {

    //Hesap açma
    public void addAccount(String name, String surname){
        System.out.println("Adding account for " + name + " " + surname);
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
    public void transferMoney(String fromAccount,String toAccount, double amount) {
        System.out.println("Transferring " + amount + "TL from account " + fromAccount + " to account " + toAccount);
    }


}

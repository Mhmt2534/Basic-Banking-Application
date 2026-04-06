package com.turkcell.entity;

public class BankAccount {
    int id;
    String accountNumber;
    String name;
    String surname;
    double balance;

    public BankAccount(int id, String accountNumber, String name, String surname, double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
      public String getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    } 


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; 
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance; 
    }



}

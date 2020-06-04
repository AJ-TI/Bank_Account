package com.aj.bank;

import com.aj.bank.Bank;

public class BankTransfer {

    public String name;
    private double balance;

    public BankTransfer (String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String transfer(double money, BankTransfer to) {

        if ((balance - money) <0 )
            System.out.println("Balance to low, choose other action");
        else
            this.balance -= money;
            to.balance += money;
        return "Operation success, you have transfer: " + money;

    }

    public void showBalance2() {
        System.out.println("Yor actual " + getName2() + " balance is: " + getBalance());
    }

    public String getName2() {
        return name;
    }
}

package com.aj.bank;


public class Bank {
    public String name;
    private double balance;

    public Bank(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public String getName() { return name; }

    public String deposit(double money) {
        balance += money;
        return "Operation success, you have deposit: " + money;
    }

    public String withdraw(double money) {
        if ((balance - money) < 0)
            System.out.println("balance to low, choose other amount");
         else
            balance -= money;
            return "Operation success, you have withdraw: " + money;
    }

    public void showBalance() {
        System.out.println("Your actual " + getName() + " balance is: " + getBalance());
    }
}

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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String deposit(double money) {
        balance += money;
        return "Operation success, actual balance: " + balance;
    }
}

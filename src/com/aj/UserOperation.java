package com.aj;


import com.aj.bank.Bank;

public class UserOperation {

    public static void main(String[] args) {
        Bank alior = new Bank("Alior", 1000.50);
        Bank mbank = new Bank("Mbank", 2000.20);
        alior.setBalance(5000.50);

        System.out.println("Balance alior: " + alior.getBalance());
        System.out.println("Balance mbank: " + mbank.getBalance());
        System.out.println(alior.deposit(2000.50));
    }
}
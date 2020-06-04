package com.aj;


import com.aj.bank.Bank;
import com.aj.bank.BankTransfer;

public class UserOperation {

    public static void main(String[] args) {
        Bank alior = new Bank("Alior", 1000.50);
        Bank mbank = new Bank("Mbank", 2000.20);
        BankTransfer alior2 = new BankTransfer("Alior", 1000.5);
        BankTransfer mbank2 = new BankTransfer("Mbank", 2000.5);

        System.out.println("Balance alior: " + alior.getBalance());
        System.out.println("Balance mbank: " + mbank.getBalance());
        System.out.println("You have deposit: " + alior.deposit(2000.50));
        alior.showBalance();
        System.out.println("You have withdrawn: " + mbank.withdraw(1000.5));
        mbank.showBalance();
        System.out.println("You have transfer: " + alior2.transfer(200,mbank2));
        alior2.showBalance2();
        mbank2.showBalance2();
    }
}
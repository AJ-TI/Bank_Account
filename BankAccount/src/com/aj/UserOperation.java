package com.aj;


import com.aj.bank.Bank;
import com.aj.bank.BankTransfer;

public class UserOperation {

    public static void main(String[] args) {
        Bank alior = new Bank("Alior", 5000.50);
        Bank mbank = new Bank("Mbank", 2000.50);
        BankTransfer alior2 = new BankTransfer("Alior", alior.getBalance());
        BankTransfer mbank2 = new BankTransfer("Mbank", mbank.getBalance());

        System.out.println("Balance alior: " + alior.getBalance());
        System.out.println("Balance mbank: " + mbank.getBalance());
        System.out.println( alior.deposit(1000.50));
        alior.getBalance();
        alior.showBalance();
        System.out.println( mbank.withdraw(1000.5));
        mbank.getBalance();
        mbank.showBalance();
        System.out.println( mbank2.transfer(200,alior2));
        alior2.showBalance2();
        mbank2.showBalance2();
    }
}
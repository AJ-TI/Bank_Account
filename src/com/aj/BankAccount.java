package com.aj;


import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        String[] accName = { "Alior", "Mbank" };
        BankAccount Alior = new BankAccount("Alior", 1000);
        BankAccount Mbank = new BankAccount("Mbank", 2000);
    }

    private double balance;
    public String name;
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("You have deposited: " + amount);
    }
    public void withdraw(double amount) {
        if ((balance-amount) >= 0) {
            System.out.println("You have withdrawn: " + amount);
        } else {
            System.out.println("balance to low");
        }
    }
    public void transfer(double amount) {
        if (this.balance < amount) {
            System.out.println("balance to low");
        } else {
            this.balance = balance - amount;
            other.balance = balance + amount;
            System.out.println("You have transfer: " + amount);
        }
    }
    void Menu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("$$$ Welcome $$$");
        System.out.println("What can I do for You ");
        System.out.println("\n");
        System.out.println("A - Check the balance");
        System.out.println("B - Deposit");
        System.out.println("C - Withdraw");
        System.out.println("D - Transfer the money");
        System.out.println("E - Exit");

        do {

            System.out.println("*************");
            System.out.println("Make a choice");
            System.out.println("*************");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {

                case 'A':
                    System.out.println("Your balance is: " + getBalance());
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("Enter the amount you want to deposit: ");
                    double amount1 = scanner.nextInt();
                    deposit(amount1);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("Enter the amount you want to withdraw: ");
                    double amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("Enter the amount you want to transfer: ");
                    double amount3 = scanner.nextInt();
                    transfer(amount3);
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("Thanks for visiting");
                    break;

                default:
                    System.out.println("Invalid option, please choose again");
                    break;

            }

        } while (option != 'E');
        System.out.println("Thanks for visiting");

    }
}
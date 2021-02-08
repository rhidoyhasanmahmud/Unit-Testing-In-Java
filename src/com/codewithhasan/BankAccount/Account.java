package com.codewithhasan.BankAccount;

public class Account {

    private int balance;

    public Account() {
        this.balance = 0;
    }

    public Account(int amount) {
        deposit(amount);
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Amount Successful");
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }

    public void withdraw(int widowAmount) {
        if (widowAmount >= 0) {
            if (balance > 0) {
                if (balance >= widowAmount) {
                    balance = balance - widowAmount;
                    System.out.println("Balance widow Successful");
                } else {
                    System.out.println("Balance not Sufficient.");
                }
            } else {
                System.out.println("Balance Is Zero.");
            }
        } else {
            System.out.println("Amount is Negative.");
        }
    }
}

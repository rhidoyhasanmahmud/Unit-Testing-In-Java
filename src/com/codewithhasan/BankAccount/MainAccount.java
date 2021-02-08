package com.codewithhasan.BankAccount;

public class MainAccount {
    public static void main(String[] args) {
        Account account = new Account(100);
        account.withdraw(100);
        System.out.println(account.getBalance());
    }
}

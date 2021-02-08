package com.codewithhasan.BankAccount.test;

import com.codewithhasan.BankAccount.Account;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void testAccount() {
        Account account = new Account();
        Assert.assertEquals(0, account.getBalance());
    }

    @Test
    public void testAccountTwo(){
        Account account = new Account(500);
        Assert.assertEquals(500, account.getBalance());
    }

    @Test
    public void testAccountThree() {
        Account account = new Account();
        account.deposit(100);
        Assert.assertEquals(100, account.getBalance());
    }

    @Test
    public void testAccountFour() {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(50);
        Assert.assertEquals(50, account.getBalance());
    }

    @Test
    public void testAccountFive() {
        Account account = new Account();
        account.deposit(-100);
        Assert.assertEquals(0, account.getBalance());
    }

    @Test
    public void testAccountSix() {
        Account account = new Account();
        account.withdraw(100);
        Assert.assertEquals(0, account.getBalance());
    }

    @Test
    public void testAccountSeven() {
        Account account = new Account();
        account.deposit(50);
        account.withdraw(100);
        Assert.assertEquals(50, account.getBalance());
    }

    @Test
    public void testAccountEight() {
        Account account = new Account();
        account.deposit(50);
        account.withdraw(-100);
        Assert.assertEquals(50, account.getBalance());
    }
}

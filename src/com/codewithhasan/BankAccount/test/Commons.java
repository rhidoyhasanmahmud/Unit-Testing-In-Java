package com.codewithhasan.BankAccount.test;

import com.codewithhasan.BankAccount.Account;
import org.junit.*;

import java.util.Scanner;

public class Commons {
    public static Account account;
    public static Scanner sc = new Scanner(System.in);

    @BeforeClass
    public static void BeforeClass() {
        account = new Account(500);
        System.out.println("Before Class.");
    }

    @AfterClass
    public static void AfterClass() {
        System.out.println("After Class.");
        sc.close();
    }

    // Run before and after of Every test case
    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @Test
    public void test() {
        System.out.println(account.getBalance());
    }

    @Test
    public void widow() {
        account.withdraw(50);
        System.out.println(account.getBalance());
    }

}

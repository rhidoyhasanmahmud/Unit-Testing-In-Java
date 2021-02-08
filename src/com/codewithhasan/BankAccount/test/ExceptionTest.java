package com.codewithhasan.BankAccount.test;

import org.junit.Test;

public class ExceptionTest {
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test() {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr[9]);
    }

    @Test(expected = ArithmeticException.class)
    public void test2() {
        int k = 5/0;
        System.out.println(k);
    }
}

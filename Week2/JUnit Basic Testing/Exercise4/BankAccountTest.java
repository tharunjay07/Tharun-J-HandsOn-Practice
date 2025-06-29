package com.example.JUnitDemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(15000.0);
        System.out.println("Test setup completed.");
    }

    @Test
    public void testDeposit() {
        double depositAmount = 400;
        account.deposit(depositAmount);
        assertEquals(15400.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        double withdrawAmount = 600;
        account.withDraw(withdrawAmount);
        assertEquals(14400.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        double withdrawAmount = 20000.0;
        account.withDraw(withdrawAmount);
        assertEquals(15000.0, account.getBalance(), 0.001); 
    }

    @After
    public void tearDown() {
        account = null;
        System.out.println("Test teardown completed.");
    }
}

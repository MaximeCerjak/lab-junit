package com.labjunit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestBankAccount {

    @Test
    public void testDebiter() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.crediter(100);
        bankAccount.debiter(50);
        assertEquals(50, bankAccount.getSolde(), 0);
    }

    @Test
    public void testCrediter() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.crediter(100);
        assertEquals(100, bankAccount.getSolde(), 0);
    }

    @Test
    public void testDebiterMontantNegatif() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.crediter(100);
        try {
            bankAccount.debiter(-50);
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(100, bankAccount.getSolde(), 0);
        }
    }

    @Test
    public void testDebiterMontantSuperieurAuSolde() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.crediter(100);
        try {
            bankAccount.debiter(150);
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(100, bankAccount.getSolde(), 0);
        }
    }

    @Test
    public void testCrediterMontantNegatif() {
        BankAccount bankAccount = new BankAccount();
        try {
            bankAccount.crediter(-100);
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(0, bankAccount.getSolde(), 0);
        }
    }

    @Test
    public void testGetSolde() {
        BankAccount bankAccount = new BankAccount();
        assertEquals(0, bankAccount.getSolde(), 0);
    }
}

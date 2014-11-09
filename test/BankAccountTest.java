package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import base.BankAccount;

public class BankAccountTest {
	BankAccount ba;

	@Test
	public void testCanSpend()
	{
		ba = new BankAccount(100);
		assertTrue(ba.canSpend(100));
	}
	@Test
	public void testCantSpend()
	{
		ba = new BankAccount(100);
		assertFalse(ba.canSpend(105));
	}
	@Test
	public void testCredit()
	{
		ba = new BankAccount(100);
		ba.credit(10);
		assertTrue(ba.getAccount() == 110);
	}
	@Test
	public void testDebit()
	{
		ba = new BankAccount(100);
		ba.debit(10);
		assertTrue(ba.getAccount() == 90);
	}
}

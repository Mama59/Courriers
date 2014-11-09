package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import base.BankAccount;

public class BankAccountTest {
	BankAccount ba;
	@Before
	public void init()
	{
		ba = new BankAccount(100);
	}
	@Test
	public void testCanSpend()
	{
		assertTrue(ba.canSpend(100));
	}
	@Test
	public void testCantSpend()
	{
		assertFalse(ba.canSpend(105));
	}
	@Test
	public void testCredit()
	{
		ba.credit(10);
		assertTrue(ba.getAccount() == 110 && ba.getAccount() > 100);
	}
	@Test
	public void testDebit()
	{
		ba.debit(10);
		assertTrue(ba.getAccount() == 90);
	}
	@Test
	public void testToString() 
	{
		assertEquals(ba.toString(), ba.getAccount() + " euros");
	}
}

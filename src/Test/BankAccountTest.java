package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import base.*;

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
		assertEquals(110, ba.getAccount());
	}
	@Test
	public void testDebit()
	{
		ba = new BankAccount(100);
		ba.debit(10);
		assertEquals(90, ba.getAccount());
	}
	//	public float canSpend(float amount);
	//	public void credit(float amount);
	//	public void debit(float amount);
		
	}

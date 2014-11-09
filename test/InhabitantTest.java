package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import letter.SimpleLetter;

import org.junit.Before;
import org.junit.Test;

import content.Text;
import base.City;
import base.Inhabitant;

public class InhabitantTest {
	City city;
	Inhabitant marine;
	Inhabitant remy;
	@Before
	public void init() {
		city = new City("Villeneuve d'Ascq");
		marine = new Inhabitant("Marine");
		remy = new Inhabitant("Remy");
	}
	@Test
	public void testCredit()
	{
		float acc = marine.getAccount().getAccount();
		marine.credit(100);
		assertTrue(marine.getAccount().getAccount()==  acc + 100 );
	}
	@Test
	public void testDebit()
	{
		float acc = marine.getAccount().getAccount();
		marine.debit(100);
		assertTrue(marine.getAccount().getAccount()==  acc - 100 );
	}
	@Test
	public void testPostLetter()
	{
		city.addInhabitant(marine);
		city.addInhabitant(remy);
		float acc = marine.getAccount().getAccount();
		int letterForTmrw = city.getNumbersOfLettersForTomorrow();
		marine.postsLetter(new SimpleLetter(marine, remy, new Text<String>("bonjour")));
		assertTrue(acc - 1 == marine.getAccount().getAccount());
		assertTrue(city.getNumbersOfLettersForTomorrow() == letterForTmrw +1);
	}
	@Test
	public void testGetCity()
	{
		city.addInhabitant(marine);
		assertEquals(marine.getCity(), city);
	}
	@Test
	public void testGetName()
	{
		assertEquals(marine.getName(), "Marine");
	}
}

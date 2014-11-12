package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import letter.SimpleLetter;

import org.junit.Before;
import org.junit.Test;

import base.City;
import base.Inhabitant;
import content.Text;

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
		float acc = marine.getAccount().getAccountAmount();
		marine.credit(100);
		assertTrue(marine.getAccount().getAccountAmount()==  acc + 100 );
	}
	@Test
	public void testDebit()
	{
		float acc = marine.getAccount().getAccountAmount();
		marine.debit(100);
		assertTrue(marine.getAccount().getAccountAmount()==  acc - 100 );
	}
	@Test
	public void testPostLetter()
	{
		city.addInhabitant(marine);
		city.addInhabitant(remy);
		float acc = marine.getAccount().getAccountAmount();
		int letterForTmrw = city.getNumbersOfLettersForTomorrow();
		marine.postsLetter(new SimpleLetter(marine, remy, new Text("bonjour")));
		assertTrue(acc - 1 == marine.getAccount().getAccountAmount());
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

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

public class CityTest {
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
	public void testToString() {
		city.addInhabitant(remy);
		assertEquals("Villeneuve d'Ascq [Remy]",city.toString());
	}
	@Test
	public void testAlreadyContains() {
		city.addInhabitant(remy);
		city.addInhabitant(remy);
		assertEquals(city.getNumbersOfInhabitants(),1);
	}
	@Test
	public void testAddInhabitant() {
		List<Inhabitant> liste = new ArrayList<Inhabitant>();
		liste.add(marine);
		city.addInhabitant(marine);
		assertEquals(liste,city.getAllInhabitants());
	}
	@Test
	public void testSendLetter()
	{
		city.addInhabitant(remy);
		city.addInhabitant(marine);
		float acc = remy.getAccount().getAccount();
		SimpleLetter l = new SimpleLetter(remy, marine, new Text<String>("coucou, comment vas tu ?"));
		city.sendLetter(l);
		assertTrue(city.getNumbersOfLettersForTomorrow() == 1);
		assertTrue(remy.getAccount().getAccount() == acc - l.getCost() );
	}
	@Test
	public void testDistributeLetter()
	{
		city.addInhabitant(remy);
		city.addInhabitant(marine);
		SimpleLetter l = new SimpleLetter(remy, marine, new Text<String>("coucou, comment vas tu ?"));
		city.sendLetter(l);
		assertTrue(city.getNumbersOfLettersForTomorrow() == 1);
		city.playDay();
		assertTrue(city.getNumbersOfLettersForToday() == 0);
		assertTrue(city.getNumbersOfLettersForTomorrow() == 0);
	}
}

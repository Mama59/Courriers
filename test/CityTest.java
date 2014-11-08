package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import base.City;
import base.Inhabitant;

public class CityTest {
	City city;
	Inhabitant marine;
	Inhabitant remy;
	@Before
	public void init() {
		city = new City("Villeneuve d'Ascq");
		marine = new Inhabitant("Marine", city);
		remy = new Inhabitant("Remy", city);
	}
	
	@Test
	public void testToString() {
		city.addInhabitant(remy);
		assertEquals("Villeneuve d'Ascq [(Remy: 100€)]",city.toString());
	}
	@Test
	public void testAddInhabitant() {
		List<Inhabitant> liste = new ArrayList<Inhabitant>();
		liste.add(marine);
		city.addInhabitant(marine);
		assertEquals(liste,city.getAllInhabitants());
	}

}

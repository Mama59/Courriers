package test;

import static org.junit.Assert.assertEquals;
import letter.PromissoryNote;
import letter.RegistredLetter;
import letter.SimpleLetter;
import letter.UrgentLetter;

import org.junit.Before;
import org.junit.Test;

import base.City;
import base.Inhabitant;
import content.Money;
import content.Text;

public class LetterTest{
	City gotham;
	Inhabitant remy,marine;
	PromissoryNote promissory;
	Money c;
	RegistredLetter<PromissoryNote> rl;
	@Before
	public void init() {
		gotham = new City("Gotham City");
		remy = new Inhabitant("Remy");
		marine = new Inhabitant("Marine");
		gotham.addInhabitant(remy);
		gotham.addInhabitant(marine);
		c = new Money(10);
		promissory = new PromissoryNote(remy,marine,c);
		rl = new RegistredLetter<PromissoryNote>(promissory);
	}
	
	@Test
	public void testToString() {
		assertEquals("a PromissoryNote letter whose content is a money content (10)",promissory.toString());
	}
	@Test
	public void testGetCost() {
		assertEquals((10*0.1)+1,promissory.getCost(),0.01);
	}
	@Test
	public void testAction() {
		assertEquals(5000,marine.getAccount().getAccountAmount(),0.01);
		assertEquals(5000,remy.getAccount().getAccountAmount(),0.01);
		promissory.action();
		assertEquals(4990,remy.getAccount().getAccountAmount(),0.01);
		assertEquals(5009,marine.getAccount().getAccountAmount(),0.01);
	}
	@Test
	public void testRegisteredLetter() {
		assertEquals(remy,rl.getSender());
		assertEquals(marine,rl.getReceiver());
		assertEquals(15 + promissory.getCost(),rl.getCost(),0.01);
	}
	@Test
	public void testToStringRegisteredLetter() {
		assertEquals("a Registred letter whose content is a PromissoryNote letter whose content is a money content (10)",rl.toString());
	}
	@Test
	public void testUrgentLetter() {
		Text text = new Text("Coucou");
		SimpleLetter sl = new SimpleLetter(marine,remy,text);
		UrgentLetter<SimpleLetter> ul = new UrgentLetter<SimpleLetter>(sl);
		assertEquals(2,ul.getCost(),0.01);
		assertEquals("a simple letter whose content is a text content (Coucou)",ul.getContent().toString());
	}

}

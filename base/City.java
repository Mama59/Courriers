package base;
import java.util.ArrayList;
import java.util.List;

import letter.Letter;

/**
 * 
 */

/**
 * @author Marine
 *
 */
public class City {

	private List<Inhabitant> inhabitants;
	private List<Letter<?>> letterBox;
	private List<Letter<?>> letterBoxForTomorrow;
	private String name;
	/**
	 * 
	 */
	public City(String name) {
		this.name = name;
		inhabitants = new ArrayList<Inhabitant>();
		letterBox = new ArrayList<Letter<?>>();
		letterBoxForTomorrow = new ArrayList<Letter<?>>();
	}
	public void addInhabitant(Inhabitant hab)
	{
		if(inhabitants.contains(hab))
		{
			System.out.println("City " + name + " already contains " + hab);
		}
		else
		{
			inhabitants.add(hab);
			hab.setCity(this);
		}			
	}
	protected void distributeLetters()
	{
		for(Letter<?> letter : letterBox)
		{
			letter.getReceiver().receiveLetter(letter);
		}
		letterBox.removeAll(letterBox);
	}
	public void playDay()
	{
		majLetters();
		distributeLetters();
	}
	protected void majLetters()
	{
		for(Letter<?> letter : letterBoxForTomorrow)
		{
			letterBox.add(letter);
		}
		letterBoxForTomorrow.removeAll(letterBoxForTomorrow);
	}
	public void sendLetter(Letter<?> letter)
	{
		letterBoxForTomorrow.add(letter);
		letter.getReceiver().debit(letter.getCost());
	}
	
	public List<Inhabitant> getAllInhabitants() {
		return this.inhabitants;
	}
	public int getNumbersOfInhabitants()
	{
		return inhabitants.size();
	}
	public String toString()
	{
		return name + " " + inhabitants.toString();	
	}
}

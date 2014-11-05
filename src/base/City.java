package base;
import java.util.ArrayList;
import java.util.List;

import Letter.Letter;

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
		// TODO Auto-generated constructor stub
		this.name = name;
		inhabitants = new ArrayList<Inhabitant>();
		letterBox = new ArrayList<Letter<?>>();
		letterBoxForTomorrow = new ArrayList<Letter<?>>();
	}
	public void addInhabitant(Inhabitant hab)
	{
		inhabitants.add(hab);
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
		distributeLetters();
		majLetters();
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
		
	}
	public String toString()
	{
		return name + " " + inhabitants.toString();	
	}
}

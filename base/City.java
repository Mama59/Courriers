package base;

import java.util.ArrayList;
import java.util.List;

import letter.Letter;

/**
 * 
 */

/**
 * @author Marine,Remy
 * 
 */
public class City {

	private List<Inhabitant> inhabitants;
	private List<Letter<?>> letterBox;
	private List<Letter<?>> letterBoxForTomorrow;
	private String name;

	/**
	 * Constructor of the City
	 * @param name of the city
	 */
	public City(String name) {
		this.name = name;
		inhabitants = new ArrayList<Inhabitant>();
		letterBox = new ArrayList<Letter<?>>();
		letterBoxForTomorrow = new ArrayList<Letter<?>>();
	}
	/**
	 * 
	 * @param hab to add to the City
	 */
	public void addInhabitant(Inhabitant hab) {
		if (inhabitants.contains(hab)) {
			System.out.println("City " + name + " already contains " + hab);
		} else {
			inhabitants.add(hab);
			hab.setCity(this);
		}
	}

	protected void distributeLetters() {
		for (Letter<?> letter : letterBox) {
			letter.getReceiver().receiveLetter(letter);
		}
		letterBox.removeAll(letterBox);
	}
	/**
	 * Method wich update the current letters and distribute letters
	 */
	public void playDay() {
		majLetters();
		distributeLetters();
	}
	/**
	 * update the list of letters
	 */
	protected void majLetters() {
		for (Letter<?> letter : letterBoxForTomorrow) {
			letterBox.add(letter);
		}
		letterBoxForTomorrow.removeAll(letterBoxForTomorrow);
	}
	/**
	 * 
	 * @param letter to send 
	 */
	public void sendLetter(Letter<?> letter) {
		letterBoxForTomorrow.add(letter);
		letter.getSender().debit(letter.getCost());
	}
	/**
	 * 
	 * @return the list of all inhabitants
	 */
	public List<Inhabitant> getAllInhabitants() {
		return this.inhabitants;
	}
	/**
	 * 
	 * @return number of inhabitants of City
	 */
	public int getNumbersOfInhabitants() {
		return inhabitants.size();
	}
	/**
	 * 
	 * @return number of letters for the next day
	 */
	public int getNumbersOfLettersForTomorrow() {
		return letterBoxForTomorrow.size();
	}
	/**
	 * 
	 * @return number of letters for the current day
	 */
	public int getNumbersOfLettersForToday() {
		return letterBox.size();
	}

	public String toString() {
		return name + " " + inhabitants.toString();
	}

}

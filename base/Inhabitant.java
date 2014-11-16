package base;

import letter.Letter;

/**
 * @author Marine,Rémy
 *
 */
public class Inhabitant {
	private BankAccount account;
	private City city;
	private String name;
	/**
	 * Constructor of Inhabitant
	 * @param name of the Inhabitant
	 */
	public Inhabitant(String name) {
		this.name = name;
		account = new BankAccount();
	}
	/**
	 * 
	 * @return the account of the Inhabitant
	 */
	public BankAccount getAccount() {
		return account;
	}
	/**
	 * 
	 * @return the city of this Inhabitant
	 */
	public City getCity() {
		return city;
	}
	/**
	 * 
	 * @return the name of the inhabitant
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param letter list of letters which will be send
	 */
	public void postsLetter(Letter<?> letter){
		System.out.println("-> " + this + " mails " + letter );
		city.sendLetter(letter);
	}
	/**
	 * Method which debit the account
	 * @param f the amount of euros to remove from the account
	 */
	public void debit(float f){
		account.debit(f);
		System.out.println("\t- "+  f + " euros are debited from " + this + " account whose balance is now " +account);
		
	}
	/**
	 * Method which credit the account
	 * @param amount of euros to add to the account
	 */
	public void credit(float amount){
		account.credit(amount);
		System.out.println("\t+ "+ this + " account is credited with " + amount + " euros; its balance is now " + account );
	}
	/**
	 * Method which receive the list of letters
	 * @param letter list in reception
	 */
	public void receiveLetter(Letter<?> letter)	{
		System.out.println("-> " + this + " receives " + letter.receiveToString());
		letter.action();
	}
	@Override
	public String toString(){
		return ""+name;
	}
	/**
	 * Set the city to the Inhabitant
	 * @param city of the Inhabitant
	 */
	public void setCity(City city) {
		this.city = city;
	}
	
}

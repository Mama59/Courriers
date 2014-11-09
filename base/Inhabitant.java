package base;

import letter.Letter;
/**
 * 
 */

/**
 * @author Marine
 *
 */
public class Inhabitant {
	private BankAccount account;
	private City city;
	private String name;
	/**
	 * 
	 */
	public Inhabitant(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		account = new BankAccount();
	}
	public BankAccount getAccount() {
		return account;
	}
	public City getCity() {
		return city;
	}
	public String getName() {
		return name;
	}
	public void postsLetter(Letter<?> letter)
	{
		System.out.println("-> " + this + " mails " + letter );
		city.sendLetter(letter);
	}
	public void debit(float f)
	{
		account.debit(f);
		System.out.println("\t- "+  f + " euros are debited from " + this + " account whose balance is now " +account);
		
	}
	public void credit(float amount)
	{
		account.credit(amount);
		System.out.println("\t+ "+ this + " account is credited with " + amount + " euros; its balance is now " + account );
	}

	public void receiveLetter(Letter<?> letter)
	{
		System.out.println("-> " + this + " receives " + letter.receiveToString());
		letter.action();
		
	}
	@Override
	public String toString() 
	{
		return ""+name;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
}

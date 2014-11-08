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
	public Inhabitant(String name, City city) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.city = city;
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
		if(canPostLetter(letter))
		{
			account.debit(letter.getCost());
			city.sendLetter(letter);
			System.out.println(name + " j'ai envoye une lettre");
		}
		else
		{
			System.out.println("Je n'ai pas assez d'argent pour envoyer ma lettre :( ");
		}
	}
	private boolean canPostLetter(Letter<?> letter) {
		// TODO Auto-generated method stub
		return (account.canSpend(letter.getCost()));
	}
	public void receiveLetter(Letter<?> letter)
	{
		letter.action();
		System.out.println(name + " j'ai recu une lettre " + letter.toString());
	}
	@Override
	public String toString() {
		return "Inhabitant [name="
				+ name + " account=" + account + "]\n";
	}
	
}

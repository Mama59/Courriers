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

	public Inhabitant(String name) {
		this.name = name;
		account = new BankAccount();
	}
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
	public void postsLetter(Letter<?> letter){
		System.out.println("-> " + this + " mails " + letter );
		city.sendLetter(letter);
	}
	public void debit(float f){
		account.debit(f);
		System.out.println("\t- "+  f + " euros are debited from " + this + " account whose balance is now " +account);
		
	}
	public void credit(float amount){
		account.credit(amount);
		System.out.println("\t+ "+ this + " account is credited with " + amount + " euros; its balance is now " + account );
	}

	public void receiveLetter(Letter<?> letter)	{
		System.out.println("-> " + this + " receives " + letter.receiveToString());
		letter.action();
	}
	@Override
	public String toString(){
		return ""+name;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
}

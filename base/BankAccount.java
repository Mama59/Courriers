package base;
/**
 * 
 */

/**
 * @author Marine,Remy
 *
 */
public class BankAccount {

	private float account;
	private float DEFAULT_AMOUNT = 5000;
	public BankAccount() {
		this.account = DEFAULT_AMOUNT;
	}
	/**
	 * Set the account with the specified amount
	 * @param account
	 */
	public BankAccount(int account) {
		this.account = account;
	}
	/**
	 * 
	 * @param amount
	 * @return if the person can spend the amount
	 */
	public boolean canSpend(float amount){
		return (account - amount) >= 0 ;
	}
	/**
	 * credit the account with the specified amount
	 * @param amount
	 */
	public void credit(float amount){
		account += amount;
	}
	/**
	 * debit the account with specified amount
	 * @param amount
	 */
	public void debit(float amount){
		account -= amount;
	}
	/**
	 * 
	 * @return the remaining amount on the account;
	 */
	public float getAccountAmount(){
		return account;
	}
	@Override
	public String toString() {
		return account + " euros";
	}
	
}

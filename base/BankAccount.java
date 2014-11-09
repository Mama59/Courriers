package base;
/**
 * 
 */

/**
 * @author Marine
 *
 */
public class BankAccount {

	private float account;
	private float DEFAULT_AMOUNT = 5000;
	public BankAccount() {
		this.account = DEFAULT_AMOUNT;
	}
	public BankAccount(int account) {
		// TODO Auto-generated constructor stub
		this.account = account;
	}
	public boolean canSpend(float amount)
	{
		return (account - amount) >= 0 ;
	}
	public void credit(float amount)
	{
		account += amount;
	}
	public void debit(float amount)
	{
		account -= amount;
	}
	public float getAccountAmount() {
		return account;
	}
	@Override
	public String toString() {
		return account + " euros";
	}
	
}

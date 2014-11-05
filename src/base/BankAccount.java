package base;
/**
 * 
 */

/**
 * @author Marine
 *
 */
public class BankAccount {

	private int account;
	private int DEFAULT_AMOUNT = 100;
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
		System.out.println("j'ai recu "+ amount + " euros");
		account += amount;
	}
	public void debit(float amount)
	{
		System.out.println("j'ai depenser "+ amount + " euros");
		account -= amount;
	}
	public int getAccount() {
		return account;
	}
	@Override
	public String toString() {
		return "BankAccount [account=" + account +  "]";
	}
	
}

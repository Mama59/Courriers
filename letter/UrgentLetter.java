package letter;
/**
 * 
 * @author Marine,Remy
 *
 */
public class UrgentLetter<T extends Letter<?>> extends AbstractLetterDecorator<T> {
	
	private Letter<?> letter;
	private int DEFAULT_TAX = 2;
	/**
	 * Constructor of the UrgentLetter
	 * @param letter to set to Urgent
	 */
	public UrgentLetter(T letter) {
		super(letter.getSender(), letter.getReceiver(), letter);
		this.letter = letter;
	}

	@Override
	public float getCost() {
		return DEFAULT_TAX * letter.getCost();
	}
	/**
	 * Call the action of letter
	 */
	public void action() {
		letter.action();
	}

	@Override
	public String toString() {
		return "an UrgentLetter whose content is " + content;
	}

}

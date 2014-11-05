package Letter;


public class RegistredLetter<T> extends AbstractLetterDecorator<T>{
	private int DEFAULT_TAX = 15;
	private Letter<?> letter;
	public RegistredLetter(T letter) {
		super(((Letter<?>) letter).getSender(), ((Letter<?>) letter).getReceiver(), letter);
		this.letter = (Letter<?>) letter;
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 15 + letter.getCost();
	}
	public void action()
	{
		letter.getReceiver().postsLetter(new ReceiptAcknowledgmentLetter(this));
		letter.action();
	}
	@Override
	public String toString() {
		return "RegistredLetter [DEFAULT_TAX=" + DEFAULT_TAX + "]";
	}

}

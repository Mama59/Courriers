package letter;


public class RegistredLetter<T extends Letter<?>> extends AbstractLetterDecorator<T>{
	private int DEFAULT_TAX = 15;
	private Letter<?> letter;
	public RegistredLetter(T letter) {
		super(letter.getSender(),letter.getReceiver(), letter);
		this.letter = letter;
	}

	@Override
	public float getCost() {
		return DEFAULT_TAX + letter.getCost();
	}
	public void action() {
		letter.action();
		letter.getReceiver().postsLetter(new ReceiptAcknowledgmentLetter(this));
	}
	@Override
	public String toString(){
		return "a Registred letter whose content is "+content;
	}
}

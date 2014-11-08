package letter;


public class UrgentLetter<T> extends AbstractLetterDecorator<T>{
	private Letter<?> letter;
	private int DEFAULT_TAX = 2;
	public UrgentLetter(T letter) {
		super(((Letter<?>) letter).getSender(), ((Letter<?>) letter).getReceiver(), letter);
		this.letter = (Letter<?>) letter;
	}


	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return DEFAULT_TAX*letter.getCost();
	}
	public void action()
	{
		letter.action();
	}
	@Override
	public String toString() {
		return "RegistredLetter ";
	}

}

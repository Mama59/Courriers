package letter;

import content.Money;
import base.Inhabitant;

public class PromissoryNote extends Letter<Money> {

	private float DEFAULT_COST;
	/**
	 * Constructor of the PromissoryNote
	 * @param sender
	 * @param receiver
	 * @param content
	 */
	public PromissoryNote(Inhabitant sender, Inhabitant receiver,Money content) {
		super(sender, receiver, content);
		int value = (Integer) content.getValue();
		DEFAULT_COST = (float) (1 + value*0.1);
	}

	@Override
	public float getCost() {
		return DEFAULT_COST;
	}

	@Override
	public String toString() {
		return "a PromissoryNote letter whose content is " + content;
	}

	@Override
	public void action() {
		sender.debit((Integer) content.getValue());
		receiver.credit((Integer) content.getValue());
		receiver.postsLetter(new ThanksLetter(this));
	}

}

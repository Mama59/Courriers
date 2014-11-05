package Letter;

import Content.Money;
import base.Inhabitant;

public class PromissoryNote extends Letter<Money<?>> {

	private float DEFAULT_COST;
	public PromissoryNote(Inhabitant sender, Inhabitant receiver,
			Money<?> content) {
		super(sender, receiver, content);
		int value = (int)content.getValue();
		DEFAULT_COST = 1 + value*10/100;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return DEFAULT_COST;
	}

	@Override
	public String toString() {
		return "PromissoryNote [DEFAULT_COST=" + DEFAULT_COST + "]";
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("debiter et credite");
		sender.getAccount().debit((int) content.getValue());
		receiver.getAccount().credit((int) content.getValue());
		receiver.postsLetter(new ThanksLetter(this));
	}

}

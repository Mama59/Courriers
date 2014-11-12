package letter;

import content.Text;

public class ThanksLetter extends SimpleLetter{

	public ThanksLetter(PromissoryNote pro) {
		super(pro.getReceiver(), pro.getSender(), new Text("Merci"));
	}

	@Override
	public String toString() {
		return "a ThanksLetter ";
	}

}

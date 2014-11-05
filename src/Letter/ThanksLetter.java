package Letter;

import Content.Text;

public class ThanksLetter extends SimpleLetter{

	public ThanksLetter(PromissoryNote pro) {
		super(pro.getReceiver(), pro.getSender(), new Text<String>("Merci"));
	}

	@Override
	public String toString() {
		return "ThanksLetter ";
	}

}
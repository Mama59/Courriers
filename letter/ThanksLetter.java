package letter;

import content.Text;
/**
 * 
 * @author Marine,Remy
 *
 */
public class ThanksLetter extends SimpleLetter{
/**
 * 
 * @param pro which is the PromissoryNote
 */
	public ThanksLetter(PromissoryNote pro) {
		super(pro.getReceiver(), pro.getSender(), new Text("Merci"));
	}

	@Override
	public String toString() {
		return "a ThanksLetter ";
	}

}

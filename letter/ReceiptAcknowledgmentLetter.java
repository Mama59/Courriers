package letter;

import content.Text;
/**
 * 
 * @author Marine,Remy
 *
 */
public class ReceiptAcknowledgmentLetter extends SimpleLetter{
	/**
	 * 
	 * @param recommande which is a RegistredLetter
	 */
	public ReceiptAcknowledgmentLetter(RegistredLetter<?> recommande) {
		super(recommande.getReceiver(), recommande.getSender(), new Text("aknowledgment of receipt for "+ recommande));
	}

	@Override
	public String toString() {
		return "an Acknowledgment of receipt which is " + content;
	}
}



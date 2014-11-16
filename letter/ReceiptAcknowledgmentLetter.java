package letter;

import content.Text;

public class ReceiptAcknowledgmentLetter extends SimpleLetter{
	
	public ReceiptAcknowledgmentLetter(RegistredLetter<?> recommande) {
		super(recommande.getReceiver(), recommande.getSender(), new Text("aknowledgment of receipt for "+ recommande));
	}

	@Override
	public String toString() {
		return "an Acknowledgment of receipt which is " + content;
	}
}



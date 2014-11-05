package Letter;

import Content.Text;

public class ReceiptAcknowledgmentLetter extends SimpleLetter{
	private static String msg = "bien recu";
	public ReceiptAcknowledgmentLetter(RegistredLetter<?> recommande) {
		super(recommande.getReceiver(), recommande.getSender(), new Text<String>(msg));
	}

	@Override
	public String toString() {
		return "ReceiptAcknowledgmentLetter " + msg;
	}

}

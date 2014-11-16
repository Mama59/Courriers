package letter;

import content.Text;
import base.Inhabitant;
/**
 * 
 * @author Marine,Remy
 *
 */
public class SimpleLetter extends Letter<Text> {

	private float DEFAULT_COST = 1;
	/**
	 * 
	 * @param sender
	 * @param receiver
	 * @param content
	 * The Constructor of SimpleLetter
	 */
	public SimpleLetter(Inhabitant sender, Inhabitant receiver,Text content) {
		super(sender, receiver, content);
	}

	@Override
	public float getCost() {
		return DEFAULT_COST;
	}

	@Override
	public String toString() {
		return "a simple letter whose content is " + content;
	}
	

	@Override
	public void action() {
	}

}

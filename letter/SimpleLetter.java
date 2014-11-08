package letter;

import content.Text;
import base.Inhabitant;

public class SimpleLetter extends Letter<Text<?>> {

	private float DEFAULT_COST = 1;
	public SimpleLetter(Inhabitant sender, Inhabitant receiver,
			Text<?> content) {
		super(sender, receiver, content);
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return DEFAULT_COST;
	}

	@Override
	public String toString() {
		return "SimpleLetter " + content;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		// no action
	}

}

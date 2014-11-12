package content;


public class Text extends AbstractContent<String>{

	public Text(String value) {
		super(value);
	}

	@Override
	public String toString() {
		return "a text content ("+value+")";
	}



}

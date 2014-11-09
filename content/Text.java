package content;


@SuppressWarnings("hiding")
public class Text<String> extends AbstractContent<String>{

	public Text(String value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public java.lang.String toString() {
		return "a text content ("+value+")";
	}



}

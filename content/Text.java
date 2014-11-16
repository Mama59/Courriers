package content;
/**
 * 
 * @author Marine,Remy
 *
 */

public class Text extends AbstractContent<String>{
	/**
	 * Constructor of Text with a string
	 * @param value of the Text
	 */
	public Text(String value) {
		super(value);
	}

	@Override
	public String toString() {
		return "a text content ("+value+")";
	}



}

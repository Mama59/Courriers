package content;
/**
 * @author Marine,Remy
 *
 */
public class Money extends AbstractContent<Integer>{
	/**
	 * Constructor of Money with an integer
	 * @param value 
	 */
	public Money(Integer value) {
		super(value);
	}

	@Override
	public String toString() {
		return "a money content ("+value +")";
	}

}

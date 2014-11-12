package content;

/**
 * 
 */

/**
 * @author Marine,Remy
 * @param <Integer>
 *
 */
public class Money extends AbstractContent<Integer>{
	/**
	 * 
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

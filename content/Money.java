package content;

/**
 * 
 */

/**
 * @author Marine,Remy
 * @param <Integer>
 *
 */
@SuppressWarnings("hiding")
public class Money<Integer> extends AbstractContent<Integer>{

	public Money(Integer value) {
		super(value);
	}

	@Override
	public String toString() {
		return "a money content ("+value +")";
	}

}

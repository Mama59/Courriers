package content;

/**
 * 
 */

/**
 * @author Marine
 * @param <Integer>
 *
 */
@SuppressWarnings("hiding")
public class Money<Integer> extends AbstractContent<Integer>{

	public Money(Integer value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "a money content ("+value +")";
	}

}

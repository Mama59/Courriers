package content;
/**
 * 
 * @author Marine,Remy
 *
 */

public abstract class AbstractContent<T> implements Content{
	protected T value;
	/**
	 * Constructor of the Abstract Content
	 * @param value
	 */
	public AbstractContent(T value) {
		this.value = value;
	}
	/**
	 * 
	 * @return the type of Value
	 */
	public T getValue()	{
		return value;
	}
	@Override
	public String toString() {
		return "AbstractContent [value=" + value + "]";
	}
	
}

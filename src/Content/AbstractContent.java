package Content;


public abstract class AbstractContent<T> implements Content{

	T value;
	public AbstractContent(T value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	public T getValue()
	{
		return value;
	}
	@Override
	public String toString() {
		return "AbstractContent [value=" + value + "]";
	}
	
}
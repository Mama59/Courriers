package Letter;

import base.Inhabitant;

public abstract class AbstractLetterDecorator<T> extends Letter<T>{

	public AbstractLetterDecorator(Inhabitant sender, Inhabitant receiver,
			T content) {
		super(sender, receiver, content);
	}
	public void action()
	{
		
	}
	@Override
	public String toString() {
		return "AbstractLetterDecorator";
	}

}

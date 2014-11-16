package letter;

import base.Inhabitant;
/**
 * 
 * @author Marine,Remy
 *
 * @param <T>
 */
public abstract class AbstractLetterDecorator<T extends Letter<?>> extends Letter<T>{
	/**
	 * 
	 * @param sender who send the letter
	 * @param receiver who receive the letter
	 * @param content of the specified letter
	 */
	public AbstractLetterDecorator(Inhabitant sender, Inhabitant receiver,T content) {
		super(sender, receiver, content);
	}
	public void action(){
		
	}
	@Override
	public String toString() {
		return "AbstractLetterDecorator";
	}

}

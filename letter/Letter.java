package letter;

import base.Inhabitant;

/**
 * @author Marine,Remy
 *
 */
public abstract class Letter<T> {
	Inhabitant sender;
	Inhabitant receiver;
	T content;
/**
 * Constructor of the Abstract Letter
 * @param sender
 * @param receiver
 * @param content
 */
	public Letter(Inhabitant sender, Inhabitant receiver, T content) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	/**
	 * 
	 * @return the content of the Letter<T>
	 */
	public T getContent() {
		return content;
	}
	/**
	 * 
	 * @return the Inhabitant who receive the letter
	 */
	public Inhabitant getReceiver() {
		return receiver;
	}
	/**
	 * 
	 * @return the Inhabitant who send the letter
	 */
	public Inhabitant getSender() {
		return sender;
	}
	/**
	 * 
	 * @return the cost of the letter 
	 */
	public abstract float getCost();
	/**
	 * method which do the action for this specified letter
	 */
	public abstract void action();
	public String sendToString() {
		return this +" to " + receiver;
	}
	public String receiveToString() {
		return this + " from " + sender;
	}
}

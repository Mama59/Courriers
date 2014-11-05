package Letter;

import base.Inhabitant;

/**
 * 
 */

/**
 * @author Marine
 *
 */
public abstract class Letter<T> {
	Inhabitant sender;
	Inhabitant receiver;
	T content;
	/**
	 * 
	 */


	public Letter(Inhabitant sender, Inhabitant receiver, T content) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	public T getContent() {
		return content;
	}
	public Inhabitant getReceiver() {
		return receiver;
	}
	public Inhabitant getSender() {
		return sender;
	}
	public abstract float getCost();
	public abstract void action();
}

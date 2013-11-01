/**
 * 
 */
package com.small.design.pattern.prototype;

/**
 * PatternBox: "Client" implementation.
 * <ul>
 *   <li>creates a new object by asking a prototype to clone itself.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author lff
 */
public class Client {

	/** stores the Prototype instance */
	private final Prototype fPrototype;

	/** 
	 * Constructor
	 */
	public Client(Prototype prototype) {
		fPrototype = prototype;
	}

	/** 
	 * This is just an example how to use the Prototype pattern. This operation
	 * must be customized based on your application needs.
	 */
	public void usePrototype() {
		// TODO: Customize this method based on your application needs.
		try {
			// create a new prototype without knowing the real implementation class
			Prototype prototype = fPrototype.toClone();
			// call a Prototype method
			prototype.doSomething();
		} catch (CloneNotSupportedException e) {
			// TODO: Handle exception
			e.printStackTrace();
		}
	}

	/** 
	 * Run application from command line.
	 */
	public static void main(String[] args) {
		new Client(new ConcretePrototype()).usePrototype();
	}

}

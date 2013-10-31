/**
 * 
 */
package com.small.design.pattern.creatiional.abstractfactory;

/**
 * PatternBox: "Client" implementation.
 * <ul>
 *   <li>uses only interfaces declared by AbstractFactory and AbstractProduct classes.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author lff
 */
public class Client {

	/** holds the factory instance */
	private final AbstractFactory fFactory;

	/** 
	 * This construtor creates a Client instance.
	 */
	public Client(AbstractFactory factory) {
		super();
		fFactory = factory;
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void useConcreteProduct() {
		// TODO: Customize this method based on your application needs.
		final AbstractProduct product = fFactory.createConcreteProduct();
		product.doSomething();
	}

}

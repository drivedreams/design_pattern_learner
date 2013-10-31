/**
 * 
 */
package com.small.design.pattern.builder;

/**
 * PatternBox: "Client" implementation.
 * <ul>
 *   <li>requests the services from Director to construct a complex object.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author lff
 */
public class Client {

	/** 
	 * This construtor creates a Client instance.
	 */
	public Client() {
		super();
	}

	/** 
	 * This is just an example how to use the ConcreteBuilder pattern. This
	 * method must be customized based on your application needs.
	 */
	public Product useConcreteBuilder() {
		final ConcreteBuilder concreteBuilder = new ConcreteBuilder();
		final Director director = new Director(concreteBuilder);
		director.construct();
		return concreteBuilder.getProduct();
	}

}

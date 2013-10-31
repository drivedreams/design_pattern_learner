/**
 * 
 */
package com.small.design.pattern.builder;

/**
 * PatternBox: "ConcreteBuilder" implementation.
 * <ul>
 *   <li>constructs and assembles parts of the product by implementing the Builder interface.</li>
 *   <li>defines and keeps track of the representation it creates.</li>
 *   <li>provides an interface for retrieving the product.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author lff
 */
public class ConcreteBuilder implements Builder {

	/** stores the Product instance of the ConcreteBuilder */
	private final Product fProduct = new Product();

	/** 
	 * This construtor creates a ConcreteBuilder instance.
	 */
	public ConcreteBuilder() {
		super();
	}

	/** 
	 * This method constructs and assembles a particular part of a Product.
	 */
	public void buildPartA() {
		// TODO: Customize this method based on your application needs.
	}

	/** 
	 * This method constructs and assembles a particular part of a Product.
	 */
	public void buildPartB() {
		// TODO: Customize this method based on your application needs.
	}

	/** 
	 * This method returns the Product instance.
	 */
	public Product getProduct() {
		return fProduct;
	}

}

/**
 * 
 */
package com.small.design.pattern.creatiional.abstractfactory;

/**
 * PatternBox: "ConcreteFactory" implementation.
 * <ul>
 *   <li>implements the operations to create concrete product objects.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author lff
 */
public class ConcreteFactory implements AbstractFactory {

	/** 
	 * This construtor creates a ConcreteFactory instance.
	 */
	public ConcreteFactory() {
		super();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public AbstractProduct createConcreteProduct() {
		return new ConcreteProduct();
	}

}

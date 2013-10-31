/**
 * 
 */
package com.small.design.pattern.creatiional.abstractfactory;

/**
 * PatternBox: "AbstractFactory" implementation.
 * <ul>
 *   <li>declares an interface for operations that create abstract product objects.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author lff
 */
public interface AbstractFactory {

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public AbstractProduct createConcreteProduct();

}

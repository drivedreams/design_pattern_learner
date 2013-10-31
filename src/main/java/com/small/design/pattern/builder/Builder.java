/**
 * 
 */
package com.small.design.pattern.builder;

/**
 * PatternBox: "Builder" implementation.
 * <ul>
 *   <li>specifies an abstract interface for creating parts of a Product object.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author lff
 */
public interface Builder {

	/** 
	 * This method constructs and assembles a particular part of a Product.
	 */
	public void buildPartA();

	/** 
	 * This method constructs and assembles a particular part of a Product.
	 */
	public void buildPartB();

}

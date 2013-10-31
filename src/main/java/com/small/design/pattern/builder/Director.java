/**
 * 
 */
package com.small.design.pattern.builder;

/**
 * PatternBox: "Director" implementation.
 * <ul>
 *   <li>constructs an object using the Builder interface.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author lff
 */
public class Director {

	/** Stores the Builder instance of the Director */
	private final Builder fBuilder;

	/** 
	 * This construtor creates a Director instance.
	 * @param builder Concrete Builder implementation.
	 */
	public Director(Builder builder) {
		super();
		fBuilder = builder;
	}

	/** 
	 * This method constructs an object by using the Builder interface.
	 */
	public void construct() {
		// TODO: Customize this method based on your application needs.
		fBuilder.buildPartA();
		fBuilder.buildPartB();
	}

}

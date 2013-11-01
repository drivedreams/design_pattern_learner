/**
 * 
 */
package com.small.design.pattern.prototype;

/**
 * PatternBox: "ConcretePrototype" implementation.
 * <ul>
 *   <li>declares an operation for cloning itself.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author lff
 */
public class ConcretePrototype implements Prototype {

	/** 
	 * Creates a new instance by cloning itself.
	 */
	public Prototype toClone() throws CloneNotSupportedException {
		return (Prototype) this.clone();
	}

	/** 
	 * This is just a dummy method that can be called by the client. Replace
	 * this method by another one which you really need.
	 */
	public void doSomething() {
	}

}

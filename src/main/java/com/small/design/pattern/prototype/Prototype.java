/**
 * 
 */
package com.small.design.pattern.prototype;

/**
 * PatternBox: "Prototype" implementation.
 * <ul>
 *   <li>declares an interface for cloning itself.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author lff
 */
public interface Prototype extends Cloneable {

	/** 
	 * Creates a new instance by cloning itself.
	 */
	public Prototype toClone() throws CloneNotSupportedException;

	/** 
	 * This is just a dummy method that can be called by the client. Replace
	 * this method by another one which you really need.
	 */
	public void doSomething();

}

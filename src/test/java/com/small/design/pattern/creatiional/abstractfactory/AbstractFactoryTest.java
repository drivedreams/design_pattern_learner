package com.small.design.pattern.creatiional.abstractfactory;


import org.junit.Test;


public class AbstractFactoryTest {
	
	@Test
	public void testCreateProduct(){
		Client client = new Client(new ConcreteFactory());
		client.useConcreteProduct();
	}
}

package com.small.design.pattern.creatiional.singleton;

import java.util.Date;

import org.junit.Test;

import com.small.design.pattern.creatiional.singleton.Singleton;
import com.small.design.pattern.util.LoggerTool;

import static org.junit.Assert.*;
public class SingleTonTest {
	
	private Date resultSingleTonTime = null;
	
	@Test
	public void testUnique(){
		Date oldTime = new Date();
		Singleton singleTon = Singleton.getUniqueInstance();
		
		singleTon.setSingleTonTime(oldTime);
	 
		 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			 
			LoggerTool.getLogger().warning("Fail to sleep for 1 second: " + e.getMessage());
		}
		
		Singleton newSingleTon = Singleton.getUniqueInstance(); 
		resultSingleTonTime = newSingleTon.getSingleTonTime();
		
		assertEquals(oldTime, resultSingleTonTime);
		singleTon.doSomething();
		newSingleTon.doSomething();
	}
	
	
	 
}

package org.tng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestScriptClassTng2HardAssest {

	@Test(priority=1)
	public void tc01 () {
	  String s="jack";
	  System.out.println(s);
	  boolean contains = s.contains("k");
	  System.out.println(contains);
	  System.out.println("tc01 :"+Thread.currentThread().getId());
	  Assert.assertEquals( true,contains);
	  System.out.println("The given Char Present on my String");
	}
	
	
	
	
	@Test(priority=2)
	public void tc02 () {
	  String s="jack";
	  System.out.println(s);
	  boolean contains = s.contains("K");
	  Assert.assertNotEquals( true,contains);
	  System.out.println("The given Char Present on my String");
	}
	
	
	
	
	@Test(priority=3)
	public void tc03 () {
	  String s="jack";
	  System.out.println(s);
	  boolean contains = s.contains("K");
	  Assert.assertTrue(contains);
	  System.out.println("The given Char Present on my String");
	}
	
	
	
	@Test(priority=4)
	public void tc04() {
	  String s="jack";
	  System.out.println(s);
	  boolean contains = s.contains("K");
	  Assert.assertFalse( contains);
	  System.out.println("The given Char Present on my String");
	}
	
	
	
	
	
	
	
	
}

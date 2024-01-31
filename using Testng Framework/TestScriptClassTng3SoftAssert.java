package org.tng;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScriptClassTng3SoftAssert {

	@Test
	public void tc01() {
		String s = "jack";
		System.out.println(s);
		boolean contains = s.contains("l");
		System.out.println(contains);
		SoftAssert ass = new SoftAssert();
		ass.assertEquals(true, contains);
		ass.assertAll();
		System.out.println("The given Char Present on my String");
	}

	@Test
	public void tc02() {
		String s = "jack";
		System.out.println(s);
		boolean contains = s.contains("K");
		SoftAssert ass = new SoftAssert();
		ass.assertNotEquals(true, contains);
		System.out.println("The given Char Present on my String");
	}

	@Test
	public void tc03() {
		String s = "jack";
		System.out.println(s);
		boolean contains = s.contains("K");
		SoftAssert ass = new SoftAssert();
		ass.assertTrue(contains);
		System.out.println("The given Char Present on my String");
	}

	@Test
	public void tc04() {
		String s = "jack";
		System.out.println(s);
		boolean contains = s.contains("K");
		SoftAssert ass = new SoftAssert();
		ass.assertFalse(contains);
		System.out.println("The given Char Present on my String");
	}

}

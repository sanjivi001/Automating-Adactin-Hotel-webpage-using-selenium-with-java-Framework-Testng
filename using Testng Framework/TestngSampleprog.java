package org.tng;

import org.testng.annotations.Test;

public class TestngSampleprog {

	
	  @Test(priority=4)
		private static void tc01() {
		System.out.println("Test1");	

		}
		@Test(priority=6,enabled=false)
		private void tc02() {
			System.out.println("Test2");	

			}
		@Test(priority=8,invocationCount=10)
		private void tc03() {
			System.out.println("Test3");	

			}
		@Test(priority=0)
		private void tc04() {
			System.out.println("Test4");	

			}
		@Test(priority=-5)
		private void tc05() {
			System.out.println("Test5");	

			}
		@Test(priority=-2)
		private static void tc06() {
			System.out.println("Test6");	

			}
			
}

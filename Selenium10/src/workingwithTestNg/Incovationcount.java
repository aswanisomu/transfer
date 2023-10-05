package workingwithTestNg;

import org.testng.annotations.Test;

public class Incovationcount {
	@Test
	public void urlpage() {
	System.out.println("url page is displayed");}
	@Test
		public void homepage() {
		System.out.println("Home page is displayed");}
	@Test(dependsOnMethods ="homepage" ,invocationCount = 5)
		public void registerpage() {
		System.out.println("Register page is displayed for 5 times");
		}
}

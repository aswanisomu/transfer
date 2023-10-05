package workingwithTestNg;

import org.testng.annotations.Test;

public class Alwaysrun {
	@Test(dependsOnMethods= "registerpage")
	public void urlpage() {
	System.out.println("url page is displayed");}
	@Test(enabled =true)
		public void homepage() {
		System.out.println("Home page is displayed");}
	@Test
		public void registerpage() {
		System.out.println("Register page is displayed");
		int i=4/3;}

}

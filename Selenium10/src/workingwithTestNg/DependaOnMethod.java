package workingwithTestNg;

import org.testng.annotations.Test;

public class DependaOnMethod {
	@Test
	public void urlpage() {
	System.out.println("url page is displayed");}
	@Test
		public void homepage() {
		System.out.println("Home page is displayed");}
	@Test
		public void registerpage() {
		System.out.println("Register page is displayed");}
	@Test(enabled = true)
		public void login() {
		System.out.println("login page ois displayed");}
	@Test(enabled = false)
		public void addBankdetails() {
		System.out.println("add bank details page is displayed");}
	@Test(description = "payee details are added")
		public void Addpayee() {
		System.out.println("Add payee details page is displayed");}
	@Test
		public void transferpage() {
		System.out.println("transfer page is displayed");}
	@Test(dependsOnMethods = {"successfulpage"})
		public void Logout() {
		System.out.println("Logoutpage is displayed");}
	@Test
		public void successfulpage() {
		System.out.println("successfull page is displayed");}
									/*@Test
									public void Logout() {
										System.out.println("logoutpage is displayed");}*/
}

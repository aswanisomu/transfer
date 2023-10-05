package workingwithTestNg;

import org.testng.annotations.Test;

public class Workingwithpriority {


@Test(priority = 0)
public void urlpage() {
	System.out.println("url page is displayed");
	}

	@Test(priority = 3)
	public void Homepage() {
		System.out.println("home page is displayed");}
		@Test(priority = 2)
		public void Registerpage() {
			System.out.println("register page is displayed");}
			@Test(priority = 4)
			public void login() {
				System.out.println("login page ois displayed");}
				@Test(priority = 5)
				public void addBankdetails() {
					System.out.println("add bank details page is displayed");}
					@Test(priority = 6)
					public void Addpayee() {
						System.out.println("add payee details page is displayed");}
						@Test(priority = 7)
						public void transferpage() {
							System.out.println("transfer page is displayed");}
							@Test
							public void successfulpage() {
								System.out.println("successfull page is displayed");}
								@Test
								public void Logout() {
									System.out.println("logoutpage is displayed");}

}
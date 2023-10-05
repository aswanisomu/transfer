package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandToForgotPassword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do ");
		Thread.sleep(2000);
		driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Request Login Info")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("toLoginPageLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();

	}

}

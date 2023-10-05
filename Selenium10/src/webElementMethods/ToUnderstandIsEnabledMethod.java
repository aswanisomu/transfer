package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandIsEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
		Thread.sleep(2000);
		WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(loginButton.isEnabled());
		
		Thread.sleep(2000);
		//driver.quit();
		driver.findElement(By.name("username")).sendKeys("aswanisomu@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Abc@12345");
		Thread.sleep(2000);
		System.out.println(loginButton.isEnabled());
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}

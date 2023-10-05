package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		WebElement radioButton=driver.findElement(By.id("gender-female"));
       System.out.println(radioButton.isSelected());
		
		Thread.sleep(2000);
		radioButton.click();
		System.out.println(radioButton.isSelected());
		
		WebElement Button=driver.findElement(By.id("gender-male"));
       System.out.println(Button.isSelected());
		
		Thread.sleep(2000);
		Button.click();
		System.out.println(Button.isSelected());
		
	}

}

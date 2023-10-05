package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandPriceValue {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Gift Cards")).click();
		driver.findElement(By.xpath("//img[@title='Show details for $100 Physical Gift Card']")).click();
	    //driver.findElement(By.xpath("//input[text()='Add to cart']")).click();
	    String price=driver.findElement(By.xpath("//input[@id='add-to-cart-button-4']/..div")).getText();
	    System.out.println(price);
	   
	    
	    

		

	}

}

package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandCake {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Actions action= new Actions(driver);
		
		driver.get("https://www.winni.in/cake/chocolate-cake");
		WebElement optionCakes=driver.findElement(By.linkText("CAKES"));
		action.moveToElement(optionCakes).perform();
		Thread.sleep(2000);
		WebElement chocolateCakes=driver.findElement(By.partialLinkText("Chocolate Cakes"));
		action.moveToElement(chocolateCakes).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Death By Chocolate Cake']")).click();
		action.click().perform();

	}

}

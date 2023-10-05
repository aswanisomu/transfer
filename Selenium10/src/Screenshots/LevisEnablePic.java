package Screenshots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LevisEnablePic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		JavascriptExecutor js=driver;
		
		driver.get("https://www.levi.in/buy-more-save-more?");
		Thread.sleep(2000);
        
		WebElement addToBag=driver.findElement(By.id("quickviewbutton"));
        js.executeScript("arguments[0].click()", addToBag);
        Thread.sleep(5000);
        driver.quit();
        


	}

}

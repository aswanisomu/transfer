package Screenshots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BataWhishlist {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		JavascriptExecutor js=driver;
		
		driver.get("https://www.bata.in/new/");

	/*	for(;;) {
			try {*/
		
			driver.findElement(By.xpath("//span[@class='cc-add-wishlist wishlist-content-add']")).click();
			WebElement addToWishlist=driver.findElement(By.xpath("//span[@class='cc-add-wishlist wishlist-content-add'/../button[@type='submit']"));
				/*break;
			}catch(Exception e) {*/
				js.executeScript("window.scrollBy(0,400)");
			/*}
	}*/


		/*WebElement addToWishlist=driver.findElement(By.xpath("//span[@class='cc-add-wishlist wishlist-content-add'/../button[@type='submit']"));*/
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", addToWishlist);
        Thread.sleep(5000);
        driver.quit();
		
	}

}

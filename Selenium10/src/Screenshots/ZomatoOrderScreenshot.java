package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ZomatoOrderScreenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		JavascriptExecutor js=driver;
		
		driver.get("https://www.zomato.com/bangalore");
		for(;;) {
			try {
				driver.findElement(By.xpath("//h4[text()='Hyderabadi Biryani Hub']")).click();
				break;
			}catch(Exception e) {
				js.executeScript("window.scrollBy(0,400)");
			}
	}
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='image']"));
		File hub=logo.getScreenshotAs(OutputType.FILE);
		File dest2=new File("./errorshots/img6.png");
		FileHandler.copy(hub, dest2);
		driver.quit();

  }
}

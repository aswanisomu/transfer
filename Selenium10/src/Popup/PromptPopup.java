package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Actions action= new Actions(driver);
		
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		 Thread.sleep(2000);
		 driver.findElement(By.id("accept-choices")).click();
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();
		 Thread.sleep(2000);
		 Alert promptPopUp=driver.switchTo().alert();
		 Thread.sleep(2000);
		 promptPopUp.sendKeys("aswani");
		 Thread.sleep(2000);
		 promptPopUp.accept();
		  System.out.println(driver.findElement(By.id("demo")).getText());
		  
		     
		     Thread.sleep(2000);
		     driver.quit();
		 
		
    
	}

}

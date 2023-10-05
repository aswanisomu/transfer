package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IciciPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Actions action= new Actions(driver);
		
		
		driver.get("https://licindia.in/branch");
		 Thread.sleep(2000);
		 WebElement Login=driver.findElement(By.linkText("Login"));
		 action.moveToElement(Login).perform();
    
       driver.findElement(By.linkText("Agent Portal")).click();
       Thread.sleep(2000);
     Alert confirmationPopUp=driver.switchTo().alert();
    // alertPopUp.accept();
     /*confirmationPopUp.dismiss();
     Thread.sleep(2000);
     driver.quit();*/
     confirmationPopUp.accept();
     Thread.sleep(2000);
     driver.quit();


	}

}

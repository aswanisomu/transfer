package allowPopup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		//ChromeOptions settings=new ChromeOptions();
		//settings.addArguments("-disable-notifications");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do"); 
		//System.out.println(driver.getWindowHandle());
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWindowID = driver.getWindowHandles();
		for(String wid:allWindowID) {
			driver.switchTo().window(wid);
			if(driver.getTitle().contains("Tracking")) {
			driver.findElement(By.linkText("Try Free")).click();
			//System.out.println(wid);
		}
		//driver.findElement(By.linkText("Try Free")).click();
		}
	}

}

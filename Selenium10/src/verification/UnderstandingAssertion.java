package verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UnderstandingAssertion {
	@Test
	public void create() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
			WebDriver driver= new ChromeDriver();
			Reporter.log("browser is launched",true);
			driver.manage().window().maximize();
			Reporter.log("browser is launched",true);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.get("https://www.adidas.co.uk/");
			Thread.sleep(1000);
			SoftAssert sa=new SoftAssert();
			
			
	}

}

package workingwithTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_003 {
	@Test
	public void openingacttime() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
	WebDriver driver=new ChromeDriver();
	Reporter.log("browser is launched", true);
	driver.manage().window().maximize();
	Reporter.log("browser is maximised", true);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://www.actitime.com/");
	Reporter.log("opened shoppers web page", true);
	driver.close();
	Reporter.log("closed the browser", true);


}
}

package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandMultiselectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage()	.timeouts().implicitlyWait(3, TimeUnit.SECONDS)	;
	    driver.get("https://demoapp.skillrary.com/");
	    WebElement
.
	}

}

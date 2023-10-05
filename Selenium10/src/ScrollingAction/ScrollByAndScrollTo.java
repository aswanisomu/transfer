package ScrollingAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByAndScrollTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		JavascriptExecutor js=driver;
		
		driver.get("https://wildcraft.com/");
        js.executeScript("window.scrollBy(0,100)");
        js.executeScript("window.scrollBy(0,100)");
        js.executeScript("window.scrollBy(0,400)");
        js.executeScript("window.scrollBy(0,100)");
        js.executeScript("window.scrollTo(0,300)");
        js.executeScript("window.scrollTo(0,200)");
	}

}

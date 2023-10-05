package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

public class DemowebshopNavigate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		//driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(2000);
		/*driver.get("demo.guru99.com/test/simple_context_menu.html");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 driver.navigate().forward();
		 //driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.quit();*/
		driver.navigate().to("https://demowebshop.tricentis.com/");
		 
	}

}

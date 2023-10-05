package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUNderstandCloseQuitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://restaurants.kfc.co.in/" );
        String title = driver.getTitle();
        System.out.println(title);
        
        Thread.sleep(5000);
        driver.quit();
        
	}
	

}

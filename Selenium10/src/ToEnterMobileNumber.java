import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterMobileNumber {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dream11.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("regEmail")).sendKeys("+919959733800");
		Thread.sleep(2000);
		
	}

}

package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandDoubleAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement plus=driver.findElement(By.xpath("//i[text()='fa fa-plus']"));
		WebElement minus=driver.findElement(By.xpath("//i[text()='fa fa-minus']"));
		action.doubleClick().perform();

	}

}

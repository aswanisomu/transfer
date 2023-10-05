package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		WebElement searchBox=driver.findElement(By.id("searchDropdownBox"));
		Select search=new Select(searchBox);
		search.selectByVisibleText("Books");
		Thread.sleep(3000);
		
		List<WebElement> searches=search.getOptions();
		for(WebElement searchoption:searches) {
			System.out.println(searchoption.getText());
			
		}
		driver.quit();
	}

}

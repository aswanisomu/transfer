package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FcebookMultiselct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage()	.timeouts().implicitlyWait(3, TimeUnit.SECONDS)	;
         driver.get("https://www.facebook.com/campaign/landing.php");
         //driver.findElement(By.xpath("//buttonvalue[text()='Allow all cookies']")).click();       
         WebElement day= driver.findElement(By.id("day"));
         Select selectOption=new Select(day);
         Thread.sleep(3000);
         selectOption.selectByIndex(2);
         
         WebElement month=driver.findElement(By.id("month"));
         Select selectOption1=new Select(month);
         Thread.sleep(3000);
         selectOption1.selectByValue(2);
         WebElement year=driver.findElement(By.id("year"));
         Select selectOption2=new Select(year);
         selectOption2.selectByVisibleText("2018");
         //selectedOptions=selectOptions.getAllSelectedOptions();
         
         
         
         Thread.sleep(3000);
         driver.quit();
         driver.quit();
         
         
         


}

	private static Select selectByIndex(int i) {
		// TODO Auto-generated method stub
		return null;
	}

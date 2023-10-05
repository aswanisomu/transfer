package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandNext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.next.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Close cookies section']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gifts & Flowers")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Birthday')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Multi Happy Birthday Balloon Candle (A13483) | £8']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Balloon')]")).getText());
		
		Thread.sleep(4000);
        driver.quit();
		

	}

}

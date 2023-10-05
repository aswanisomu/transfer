package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumAddtocartBUtton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		 Thread.sleep(2000);


        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-flat']")).click();
        Alert confirmationPopUp=driver.switchTo().alert();
        confirmationPopUp.accept();
        Thread.sleep(2000);
        driver.quit();
        
	}

}

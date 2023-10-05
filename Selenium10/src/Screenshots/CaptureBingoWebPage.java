package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;

public class CaptureBingoWebPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.get("https://bingosnacks.com/");
		WebElement img5=driver.findElement(By.id("carousel-example-generic"));
		File src = img5.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorshots/img5.png");
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
		WebElement logo=driver.findElement(By.xpath("//img[@title='Bingo!']"));
		File eleImg=logo.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./errorshots/img6.png");
		FileHandler.copy(eleImg, dest1);
		driver.quit();

	}

}

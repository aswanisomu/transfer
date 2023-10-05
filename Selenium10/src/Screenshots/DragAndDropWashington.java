package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.naming.ldap.SortResponseControl;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class DragAndDropWashington {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Actions action= new Actions(driver);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement box3=driver.findElement(By.id("box3"));
		WebElement box103=driver.findElement(By.id("box103"));
		action.dragAndDrop(box3, box103).perform();
		Thread.sleep(2000);
		File src = box103.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorshots/img2.png");
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}

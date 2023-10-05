import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe "); 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.get("https://en-gb.facebook.com/reg/");
		 Thread.sleep(2000);
		 //driver.findElement(By.xpath("//body[@dir='ltr']")).click();
		 driver.findElement(By.id("u_0_b_0I")).sendKeys("aswani");
		 driver.findElement(By.id("u_0_d_h9")).sendKeys("somu");
		 driver.findElement(By.id("u_0_g_oo")).sendKeys("aswanisomu@gmail.com");
		 driver.findElement(By.id("password_step_input")).sendKeys("Aswani@123");
		 driver.findElement(By.id("u_0_s_gg")).click();
		 
		 

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	private @FindBy(id= "Email") WebElement
}

package Script;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
public class WebDriverMethods {
	//Maximize WebDriver Method
	public void maximizeScreen(WebDriver driver) {
		driver.manage().window().maximize();
	}
	//Implicit wait WebDriver Method
	public void implicityWaitWDMethod(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
}

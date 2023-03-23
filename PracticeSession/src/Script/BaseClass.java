package Script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	//Method To Launch Browser 
	public void toLaunchBrowser(WebDriver driver) {
		//Considered Chrome Browser
		WebDriverManager.chromedriver();
		driver=new ChromeDriver();
		System.out.println("Browser Launched Succesfully");
	}
	//Method To get URL
	public void validURL(WebDriver driver) {
		driver.get("https://www.jango.com/");
		System.out.println("URL is Valid");
	}
	//Method To Close Browser
	public void closeBrowser(WebDriver driver) {
		driver.quit();
		System.out.println("Browser Closed Succesfully");
	}
}

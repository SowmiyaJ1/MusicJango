package Script;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class MusicToPlay extends BaseClass{
	static WebDriver driver;
public static void main(String[] args) {
	BaseClass bc=new BaseClass();
	//launchingBrowser
	bc.toLaunchBrowser(driver);
	//Providing URL
	bc.validURL(driver);
	WebDriverMethods wdm=new WebDriverMethods();
	//Maximizing the Screen
	wdm.maximizeScreen(driver);
	//Implicit Wait
	wdm.implicityWaitWDMethod(driver);
	//ChoosingFirstOptionToPlayMusic
	driver.findElement(By.xpath("(//div[@class=\"play-hover\"])[1]")).click();
	//Storing name of the song in songPlaying
	WebElement songPlaying = driver.findElement(By.xpath("//div[@id=\"player-radio\"]"));
	//Getting the Song Name Which Played Recently
	System.out.println("This Song "+songPlaying.getText()+" is Playing");
	//Closing Browser
	bc.closeBrowser(driver);
}
}

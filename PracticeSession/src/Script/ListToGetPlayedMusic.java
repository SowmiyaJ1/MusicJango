package Script;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ListToGetPlayedMusic extends BaseClass{
	static WebDriver driver;
public static void main(String[] args) throws Throwable {
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
	//Playing Multiple Songs
	WebElement mulpileSongPlay = driver.findElement(By.xpath("//div[@aria-label=\"Click to Skip to Next Song\"]"));
	mulpileSongPlay.click();
	mulpileSongPlay.click();
	mulpileSongPlay.click();
	Thread.sleep(2000);
	//To Fetch Value of Played Songs
	driver.findElement(By.xpath("//a[@href=\"/my_stations\"]")).click();
	//List of the Song which Played Recently
	WebElement playedRecently = driver.findElement(By.xpath("//div[@class=\"card video-card\"]"));
	//Using For Loop To Skip the Current Play list
	for(int i=0;i<3;i++) {
		if(songPlaying.getText().equals(playedRecently.getText())) {
			
		}
		else {
			System.out.println("These are the songs in the pipeline "+playedRecently.getText());
		}
	}
	bc.closeBrowser(driver);
}
}

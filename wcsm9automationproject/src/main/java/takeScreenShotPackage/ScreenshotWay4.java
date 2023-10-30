package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenshotWay4 {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
	//take screen shot of web page
	EventFiringWebDriver ewf = new EventFiringWebDriver(driver);
	File src = ewf.getScreenshotAs(OutputType.FILE);
	//define way for storing screenshot
	File dest = new File("./Screenshot/seleniumss.png");
	//store the ss in to dest
	Files.copy(src, dest);
		
		
	  
		

	}

}

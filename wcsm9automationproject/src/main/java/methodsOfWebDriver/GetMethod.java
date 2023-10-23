package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		// open the browser
      WebDriver driver=new ChromeDriver();
      //maximixe the browser.
      driver.manage().window().maximize();
      //launch the web application.
      driver.get("https://www.primevideo.com");
      //stop the exicution of script for 2sec.
      Thread.sleep(2000);
      //close the browser.
      driver.close();
	}

}

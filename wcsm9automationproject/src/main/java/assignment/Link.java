package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		   //maximize the browser
		   driver.manage().window().maximize();
		   //launch the webapplication
		   driver.get("https://www.facebook.com/login/");
		   Thread.sleep(2000);
		   driver.findElement(By.id("email")).sendKeys("manevishal7783@gmail.com");
           Thread.sleep(2000);
		   driver.findElement(By.id("pass")).sendKeys("80073");
	}

}

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/login/");
		   Thread.sleep(2000);
		   driver.findElement(By.id("email")).sendKeys("manevishal7783@gmail.com");
         Thread.sleep(2000);
		   driver.findElement(By.id("pass")).sendKeys("80073");

	}

}

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.instagram.com/accounts/login/");
		   Thread.sleep(2000);
		   driver.findElement(By.tagName("input")).sendKeys("manevishal7783@gmail.com");
        Thread.sleep(2000);
		   driver.findElement(By.tagName("input")).sendKeys("80073");
	}

}

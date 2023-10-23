package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Airvistara {
	public static void main(String[] args) throws InterruptedException {
		// Create an instance of ChromeOptions class.
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
// identify user name text box using cssSelector
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
// identify user Password box using cssSelector
		driver.findElement(By.cssSelector("input[class='oxd-input oxd-input--active']")).
		sendKeys("admin123");
		Thread.sleep(2000);
// identify log in button using cssSelector
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		

	}

}

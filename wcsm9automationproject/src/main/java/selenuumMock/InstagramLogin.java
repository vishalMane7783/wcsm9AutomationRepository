package selenuumMock;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	Thread.sleep(200);
	driver.findElement(By.name("username")).sendKeys("vishal");
	driver.findElement(By.name("password")).sendKeys("vishal123");
	}

}

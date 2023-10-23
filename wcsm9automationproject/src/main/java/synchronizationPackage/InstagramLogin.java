package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin123");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		

	}

}

package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.Google.com");
		Thread.sleep(2000);
		//click on google map
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		Thread.sleep(2000);
		//switch controll to frame
		WebElement frameElement = driver.findElement(By.name("app"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("app")
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
	

	}

}

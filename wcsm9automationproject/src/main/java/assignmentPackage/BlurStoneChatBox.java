package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlurStoneChatBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		//switch the controll the frame
		//driver.switchTo().frame(6);
		//driver.switchTo().frame("fc_widget");
		WebElement frameElement = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("chat-icon")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("vishu");
		driver.findElement(By.id("chat-fc-email")).sendKeys("vishu123@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("8007388888");
		driver.findElement(By.partialLinkText("Start Chat")).click();
		
		
		 
	}

}

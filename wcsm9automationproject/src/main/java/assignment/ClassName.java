package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.google.co.in");
           Thread.sleep(2000);
           driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
           driver.findElement(By.className("lNPNe")).click();
           Thread.sleep(2000);
           
	}

}

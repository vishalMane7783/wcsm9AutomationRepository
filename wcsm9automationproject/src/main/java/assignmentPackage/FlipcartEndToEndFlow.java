package assignmentPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartEndToEndFlow {
       public static void main(String[] args) {
    	   WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
   		driver.get("https://www.flipkart.com/");
   		driver.findElement(By.xpath("//span[text()='✕']")).click();
   		driver.findElement(By.name("q")).sendKeys("iphone");
   		driver.findElement(By.xpath("//button[contains(@title,'Search ')]")).click();
   		 String parentHandle = driver.getWindowHandle();
   		 driver.findElement(By.xpath("//div[text()='2. APPLE iPhone 13 (Starlight,...']")).click();
   		 Set<String> allHandles = driver.getWindowHandles();
   		 for(String wh:allHandles)
   		 {
   			 driver.switchTo().window(wh);
   			 
   		 }
   		 driver.findElement(By.xpath("//div[@class='_3Oikkn _3_ezix _2KarXJ' and (text()='Green')]")).click();
   		 driver.findElement(By.partialLinkText("256 GB")).click();
   		 driver.findElement(By.id("pincodeInputId")).clear();
   		 driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
   		 driver.findElement(By.xpath("//span[text()='Check']")).click();
   		 driver.findElement(By.xpath("//button[contains(@class='_2KpZ6l _2U9uOA _3v1-ww') and (text()='GO TO CART')")).click();
   		 driver.findElement(By.xpath("//div[text()='Remove']")).click();
   		 driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
	}
}

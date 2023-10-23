package assignmentPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartFindElements {

	public static void main(String[] args) throws InterruptedException {
		// 
		WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
   		driver.get("https://www.flipkart.com/");
   		driver.switchTo().activeElement().sendKeys("Laptop");
   		driver.findElement(By.xpath("//span[text()='✕']")).click();
   		driver.findElement(By.name("q")).sendKeys("laptop");
   		Thread.sleep(2000);
   		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
   		driver.findElement(By.xpath("//div[text()='Brand']")).click();
   		Thread.sleep(2000);
   		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();
   		driver.findElement(By.xpath("//div[text()='Processor']")).click();
   		Thread.sleep(2000);
   		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
   		Thread.sleep(2000);
   		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
        driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Customer Ratings']")).click();
   		driver.findElement(By.xpath("//div[text()='3★ & above']")).click();
   		List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
   		List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
   		
   		for(int i=0;i<allLaptops.size();i++)
   		{
   			String laptop = allLaptops.get(i).getText();
   			Thread.sleep(2000);
   		  for(int j=1;j<=i;j++)
   		  {
   			allPrices.get(j).getText();
   			Thread.sleep(2000);
   			System.out.println(laptop+":");
   		  }
   		
   		
   		}
   		

	}

}

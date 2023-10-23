package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipcartAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[contains(@aria-lable,'Brands and More')]")).click();//button[contains(@aria-lable,'Brands and More')]
		driver.findElement(By.xpath("(//div[@class='_4r0lT']/ancestor::div[@class='_3ply-c row']/decendant[@class='_30jeq3_1_WHN1'][2]")).getText();//div[@class='_4r0lT']/ancestor::div[@class='_3ply-c row']/decendant[@class='_30jeq3_1_WHN1'][2] 

	}

}

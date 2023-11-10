package actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTimeDoubleClick {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://vishal-7783/login.do");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='content administration']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(2000);
		 WebElement doubleclick = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Thread.sleep(2000);
		  Actions act = new Actions(driver);
		  act.doubleClick(doubleclick).perform();
		  
		  Thread.sleep(2000);
			
			File file = new File("./autoIT/FileUpload.exe");
			String absPath = file.getAbsolutePath();
			
			Runtime.getRuntime().exec(absPath);
			Thread.sleep(6000);
			Runtime.getRuntime().exec(absPath);
			
			Thread.sleep(2000);
		  
		
		
		

	}

}

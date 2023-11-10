package dropDownHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAppsFileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(6000);
		WebElement targetElement = driver.findElement(By.name("file"));
		Thread.sleep(2000);
		  Actions act = new Actions(driver);
		  act.doubleClick(targetElement).perform();
		Thread.sleep(6000);
		File file = new File("./autoIT/DemoAppsUpload");
		String absPath = file.getAbsolutePath();
		Thread.sleep(6000);
		Runtime.getRuntime().exec(absPath);
		Thread.sleep(6000);
		Runtime.getRuntime().exec(absPath);
		driver.quit();
		
		

	}

}

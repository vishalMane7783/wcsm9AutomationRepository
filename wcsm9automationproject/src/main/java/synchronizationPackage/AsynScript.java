package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AsynScript//handle disable element 
{
    public static void main(String[] args) 
	{
	WebDriver	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
	//explicit type casting in to java script exicutor
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('name').value='vishu'");
	jse.executeScript("document.getElementById('email').value='vish123@gmail.com'");
	jse.executeScript("document.getElementById('email').value='Pass@123'");
	WebElement disableRegistorButton = driver.findElement(By.xpath("//button[text()='Register']"));
	
	

	}

}

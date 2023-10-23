package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("file:///C:/Users/Dell/Desktop/WCSM9%20webelement/SimpleLoginPage.html");
		   Thread.sleep(2000);
		   driver.findElement(By.tagName("input")).sendKeys("admin");
		   driver.findElement(By.tagName("input")).sendKeys("manager");
	}

}

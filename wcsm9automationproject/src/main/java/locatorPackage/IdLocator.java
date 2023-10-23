package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		// to launch the browser create a object of chrome driver
		WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("file:///C:/Users/Dell/Desktop/WCSM9%20webelement/SimpleLoginPage.html");
		   Thread.sleep(2000);
		   driver.findElement(By.id("id1")).sendKeys("admin");
           Thread.sleep(2000);
		   driver.findElement(By.id("id2")).sendKeys("manager");

	}

}

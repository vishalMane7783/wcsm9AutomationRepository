package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	   		driver.manage().window().maximize();
	           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
	   		driver.get("http://desktop-dsetq6l/login.do");
	   		WebElement usmTB = driver.findElement(By.name("username"));
	   		usmTB.sendKeys("admin");

	}

}

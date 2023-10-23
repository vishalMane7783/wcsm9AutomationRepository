package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("file:///C:/Users/Dell/Desktop/WCSM9%20webelement/checkbox%20(1).html");
		   Thread.sleep(2000);
		   //identify d radio button
		   driver.findElement(By.name("name4")).click();
		   Thread.sleep(2000);
		   //identify a radio buttom
		   driver.findElement(By.name("name1")).click();
		   // we get NoSuchElementException
		   driver.findElement(By.name("name")).click();
           Thread.sleep(2000);
           driver.close();
		   
	}

}

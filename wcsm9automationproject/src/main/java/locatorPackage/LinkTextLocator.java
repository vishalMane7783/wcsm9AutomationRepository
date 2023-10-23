package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Desktop/WCSM9%20webelement/link.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("seleniumLink")).click();

	}

}

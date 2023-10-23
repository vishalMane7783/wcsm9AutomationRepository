package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	public static void main(String[] args) throws InterruptedException {
	    ChromeOptions co=new ChromeOptions();
	    co.addArguments("--disable-notification--");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("pune");
		
		
		
	}

}

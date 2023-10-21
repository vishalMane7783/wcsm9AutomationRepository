package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchFirefoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("FireFox browser is open");
		Thread.sleep(2000);
		driver.close();
		System.out.println("FireFox Browser is closed");
		
	}


}

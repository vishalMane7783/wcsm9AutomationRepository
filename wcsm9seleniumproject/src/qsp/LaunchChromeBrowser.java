package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// to launch the chrome browser we neet to create a object of egdeDriver.
		WebDriver Driver =new ChromeDriver();
		//to maximise the browser we can cll method is mandatory Driver.manage().window().maximize();
		Driver.manage().window().maximize();
		System.out.println("Chrome Browser is open");
		Thread.sleep(2000);
		Driver.close();
		System.out.println("chrome is close");
       
	}

}

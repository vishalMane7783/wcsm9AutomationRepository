package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
      public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Browser Value");
		String browserValue = sc.next();
		
		if(browserValue.equalsIgnoreCase("chrome")) {
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.close();
	    System.out.println("Chrome browser is open");
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			System.out.println("Firefox browser is open ");
		}
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
		   WebDriver driver =new EdgeDriver();
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   driver.close();
		   System.out.println("Edge browser is open");
		}
		
		
			
	}

}

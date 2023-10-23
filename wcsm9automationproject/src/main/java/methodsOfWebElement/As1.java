package methodsOfWebElement;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class As1 {
	
	
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner Sc = new Scanner(System.in);
		  System.out.println("Pass the browser which u want to launch");
		  String browserValue = Sc.next();
		  
		  if(browserValue.equalsIgnoreCase("chrome"))
		  {
			  driver=new ChromeDriver();
		  }
		  else if(browserValue.equalsIgnoreCase("edge"))
		  {
			  driver=new EdgeDriver();
		  }
		  else
		  {
			System.out.println("this not a browser value");  
		  }
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.amazon.in/");
		 
	}
	public static void searchProduct(String product) throws InterruptedException
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(product);
		Thread.sleep(2000);
		driver.findElement(By.name("url")).click();
		Thread.sleep(2000);
		//div[text()='watches']
		driver.findElement(By.xpath("//option[text()='watches']")).click();
		
	}
	

}

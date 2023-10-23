package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-dsetq6l/login.do");
	String urlOfLoginPage = driver.getCurrentUrl();
	System.out.println(urlOfLoginPage);
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.getCurrentUrl();
	driver.findElement(By.id("LoginButton")).click();
	Thread.sleep(2000);
	driver.quit();
	
	
	
	

	}

}

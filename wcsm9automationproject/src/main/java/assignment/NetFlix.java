package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlix {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.netflix.com/in/login");
		   Thread.sleep(2000);
		   //identify phone or email text box
		   driver.findElement(By.id("id_userLoginId")).sendKeys("shfrvjn");
		   driver.findElement(By.id("id_password")).sendKeys("swde@123");
		   driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
		   

	}

}

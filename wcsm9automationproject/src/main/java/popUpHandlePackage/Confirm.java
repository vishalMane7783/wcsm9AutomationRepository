package popUpHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		 Thread.sleep(2000);
      driver.findElement(By.xpath("//section[text()='Popups']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//section[text()='Javascript']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[text()='Confirm']")).click();
      driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
      //handle confirmation pop up
      Alert confirm = driver.switchTo().alert();
      
      Thread.sleep(2000);
      //aceept confirmation pop up
      String TextOfconfirm =confirm.getText();
      System.out.println(TextOfconfirm);
      Thread.sleep(2000);
      confirm.accept();//is select ok
     

	}

}

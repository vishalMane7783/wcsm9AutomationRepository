package popUpHandlePackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		 Thread.sleep(2000);
      driver.findElement(By.xpath("//section[text()='Popups']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//section[text()='Authentication']")).click();
      Thread.sleep(2000);
      //address of authenticatication page window
      String authPageWindowHandle = driver.getWindowHandle();
      Thread.sleep(2000); 
      driver.findElement(By.xpath("//a[text()='Login']")).click();
      //get the address of all the present windows
      Set<String> allWindowHandles = driver.getWindowHandles();
      //shift controll to authentication pop up window page
      for(String wh:allWindowHandles)
      {
    	  if(!authPageWindowHandle.equals(wh))
    	  {
    		driver.switchTo().window(wh) ; 
    	  }
      }
	}
	 public static void handle_authentication_popup() throws AWTException
     
     {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
   	  
   	  
     }

}

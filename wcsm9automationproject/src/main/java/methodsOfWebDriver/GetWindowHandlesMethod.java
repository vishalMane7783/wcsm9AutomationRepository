package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		   //maximize the browser
		   driver.manage().window().maximize();
		   //launch the webapplication
		   driver.get("http://omayo.blogspot.com/");
		   Thread.sleep(2000);
		   //take the address of current wndow or browseer or parent browser
		   //
		   String parentHandle = driver.getWindowHandle();
		   System.out.println("address of parent browser:"+parentHandle);
		   Thread.sleep(2000);
		   driver.findElement(By.partialLinkText("open a popup window")).click();
		  Set<String> allHandles = driver.getWindowHandles();
		  //print the address of browser each loop
		  for(String wh:allHandles)
		  {
			//System.out.println("parent Handle:"+wh+"child Handle:"+wh);
			  if(!parentHandle.equals(wh))
			  {
				  System.out.println("address of child window:"+wh);
			  }
			  else
				  System.out.println("address of parent window:"+wh);

				  
			  
		  }
		   

	}

}

package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment1 {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://omayo.blogspot.com/");
	 Thread.sleep(2000);
	 
	  String parentHandle = driver.getWindowHandle();
	 driver.findElement(By.partialLinkText("Open a popup window")).click();
	 Thread.sleep(2000);

	 Set<String> allHandles = driver.getWindowHandles();
	 for(String wh: allHandles)
	 {
		 if(parentHandle.equals(wh))
		 {
			 System.out.println("Address of parent browser"+wh);
		 }
		 else
		 {
			 System.out.println("address of child window"+wh);
			 String childdHandle=wh;
			 driver.switchTo().window(childdHandle);
			 Thread.sleep(2000);
			 driver.close();
			 
		 }
		 
	 }
	 
	 
	 

	}

}

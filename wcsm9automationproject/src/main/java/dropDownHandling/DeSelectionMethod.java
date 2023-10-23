package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class DeSelectionMethod {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//lauch the web application
		driver.get("file:///C:/Users/ketan/Desktop/ATestingSeleniun/wcsm9WebElement/MultiSelectStaticDropDown.html");
		
		//identify dropDown
	      WebElement dropDown4 = driver.findElement(By.id("id4"));
	       
	      //select class object creation
	     Select sel4 = new Select(dropDown4);
	      
	      
	     
	      //for multiple options form multiselect dropDown
	      for (int i =0; i<4;i++) {
	    	  sel4.selectByIndex(i);
		}
	    
	      
	      //for deselecting multiple options form multiselect dropDown
	      for (int i =0; i<4;i++) {
	    	  sel4.deselectByIndex(i);
	    	  
		}
	      
	      
	      
	}

}

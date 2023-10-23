package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement sel1 = driver.findElement(By.xpath("//select[contains(@class,'border-0 px-3 p')]"));
		 Select dropdown = new Select(sel1);
		 dropdown.selectByIndex(3);
		 
		 WebElement sel2 = driver.findElement(By.xpath("//option[text()='Select country']"));
	     Select dropdown2 = new Select(sel2);
	     dropdown.selectByVisibleText("India");
	     
	     //select the state dropdown
	     WebElement state = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
	
	  //select class for dropdown
	     Select sel3 =  new Select(state);
	    Thread.sleep(2000);
	    sel3.selectByVisibleText("Maharashtra");
	     
	    
         //Select the multi select options
	    driver.findElement(By.partialLinkText("Multi Sel")).click();
	    
	    //select the country dropDown
	    WebElement multicountry = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
	    
	    Select sel4 = new Select(multicountry);
	    Thread.sleep(2000);
	   String[] opt = {"India","United States","France"};
	    
	   //for(int i = 0;i < opt.length;i++){
	  // sel3.selectByVisibleText(opt[i]);
	 //  }
	   Thread.sleep(2000);
	    driver.navigate().to("file:///C:/Users/ketan/Desktop/ATestingSeleniun/wcsm9WebElement/MultiSelectStaticDropDown.html");
	     
	     //identify dropDown
	      WebElement dropDown4 = driver.findElement(By.id("id4"));
	       
	      //select class object creation
	     Select sel5 = new Select(dropDown4);
	      
	      
	     // sel4.selectByIndex(2);
	      
	      //for multiple options form multiselect dropDown
	      for (int i =0; i<4;i++) {
	    	  sel4.selectByIndex(i);
		}
	     
	

	}

}

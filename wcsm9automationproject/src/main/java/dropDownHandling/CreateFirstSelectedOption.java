package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Dell/Desktop/WCSM9%20webelement/SingleSelectdropdown.html");
		WebElement dropdown1 = driver.findElement(By.id("id1"));
		Select sel = new Select(dropdown1);
		Thread.sleep(2000);
		sel.selectByValue("v1");
	    WebElement firstOpt = sel.getFirstSelectedOption();
		System.out.println(firstOpt.getText());
		
		driver.navigate().to("file:///C:/Users/Dell/Desktop/WCSM9%20webelement/multydropdown.html");
		WebElement dropdown = driver.findElement(By.id("id1"));
		Select sel2 = new Select(dropdown);
		for(int i=5;i<8;i++)
		{
		sel2.selectByIndex(i);	
		}
		System.out.println(sel2.getFirstSelectedOption().getText());

	}

}

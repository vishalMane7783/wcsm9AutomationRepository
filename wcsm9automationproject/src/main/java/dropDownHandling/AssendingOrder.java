package dropDownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssendingOrder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Dell/Desktop/WCSM9%20webelement/vishu.html");
		//identify dropdown and find element
		WebElement menuDropdown = driver.findElement(By.id("id1"));
		//get all the option of menuDropDown
		Select sel = new Select(menuDropdown);
		List<WebElement> allOpps = sel.getAllSelectedOptions();
		TreeSet<String> Ts = new TreeSet<String>();
		for(int i=0;i<allOpps.size();i++)
		{
			WebElement op = allOpps.get(i);
			String dropdownOption = op.getText();
			System.out.println(dropdownOption);
			//add the dropdown into hashset and remove duplicate
			Ts.add(dropdownOption);
		}
		Thread.sleep(2000);
		for(String opt:Ts)
		{
			Thread.sleep(2000);
			System.out.println(opt);
		}
	}

}

package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrapElementMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Dell/Desktop/WCSM9%20webelement/SingleSelectdropdown.html");
		WebElement dropdown1 = driver.findElement(By.id("id1"));
		Select sel = new Select(dropdown1);
		WebElement allOps = sel.getWrappedElement();
		System.out.println(allOps.getText());
		List<WebElement> options = sel.getOptions();
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		//select the option from dropdown without using selection method
		for(WebElement opt:options)
		{
			Thread.sleep(2000);
			if(opt.getText().equals("vadapav"))
			{
				
				opt.click();
				break;
			}
		}
	}

}

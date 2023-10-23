package methodsOfWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel1 {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
			driver.get("https://demoapps.qspiders.com/");
			driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
			driver.findElement(By.partialLinkText("Multi Select"));
			
			WebElement phonedropdown1 = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
			
			Select sel1 = new Select(phonedropdown1);
			List<WebElement> allopps = sel1.getOptions();
			
			for(int i=0;i<=allopps.size();i++)
			{
				String opt = allopps.get(i).getText();
				Thread.sleep(2000);
				System.out.println(opt);
			}
	}

}

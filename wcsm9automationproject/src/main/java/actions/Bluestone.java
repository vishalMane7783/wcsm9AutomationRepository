package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement CoinsTarget = driver.findElement(By.xpath("//a[@title='Coins']"));
		Actions act = new Actions(driver);
		act.moveToElement(CoinsTarget).build();
		Thread.sleep(2000);
       
       driver.findElement(By.partialLinkText("//span[text()='Coins by Design']")).click();
       if(driver.findElement(By.xpath("//h1[text()=' Lakshmigoldcoins ']")).isDisplayed())
       {
    	   System.out.println("text display");
       }
       else
       {
    	   System.out.println("not display");
       }
	}

}

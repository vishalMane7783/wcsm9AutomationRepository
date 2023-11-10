package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://jqueryui.com/dropable");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Demos']")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Droppable")).click();
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	WebElement src1 = driver.findElement(By.id("draggable"));
	
	WebElement target1 = driver.findElement(By.id("droppable"));
	
	Actions act = new Actions(driver);
	Thread.sleep(2000);
	act.dragAndDrop(src1, target1).perform();
	
	

	}

}

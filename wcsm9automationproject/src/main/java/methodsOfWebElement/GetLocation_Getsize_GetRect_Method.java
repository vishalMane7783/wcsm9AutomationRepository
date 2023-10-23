package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetLocation_Getsize_GetRect_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		// identify email text box
		WebElement emailTB = driver.findElement(By.cssSelector("input[name='email']"));
		
		// get the location of email text box
		Point loc = emailTB.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		System.out.println("location of emailTB :"+xaxis+" :"+yaxis);
		
		// get the size of email text box
		Dimension size = emailTB.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		
		System.out.println("size of emailTB :"+height+" :"+width);
		
		// get the location of email text box and get the size of email text box
		Rectangle rect = emailTB.getRect();
		System.out.println(rect.getX()+": "+rect.getY());
		System.out.println(rect.getHeight()+": "+rect.getWidth());
		
		
		
		
	}

}

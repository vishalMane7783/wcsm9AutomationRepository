package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   WebDriver driver =new ChromeDriver();
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   String titleofpage = driver.getTitle();
	   System.out.println(titleofpage);
	   driver.close();

	}

}

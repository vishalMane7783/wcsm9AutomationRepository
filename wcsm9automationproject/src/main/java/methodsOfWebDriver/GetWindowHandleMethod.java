package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		   //maximize the browser
		   driver.manage().window().maximize();
		   //launch the webapplication
		   driver.get("http://omayo.blogspot.com/");
		   Thread.sleep(2000);
		   //take the address of current wndow or browseer or parent browser
		   //
		   String parentHandle = driver.getWindowHandle();
		   System.out.println(parentHandle);
		   

	}

}

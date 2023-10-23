package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceCode {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
	   WebDriver driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://desktop-dsetq6l/login.do");
	   //take the source code of login page.....
	   String loginPageSourceCode = driver.getPageSource();
	   System.out.println(loginPageSourceCode);
	   Thread.sleep(2000);
	   driver.quit();

	}

}

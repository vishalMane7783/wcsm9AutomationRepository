package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://desktop-dsetq6l/login.do");
		  String loginPageTitle = driver.getTitle();
		  System.out.println("loginPageTitle");
		  driver.close();
		   

	}

}

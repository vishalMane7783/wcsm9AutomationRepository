package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeDriver {

	public static void main(String[] args) throws InterruptedException {
		// to launch the edge Browser we need to create obj of EdgeDriver();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is open");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Browser is close");

	}

}

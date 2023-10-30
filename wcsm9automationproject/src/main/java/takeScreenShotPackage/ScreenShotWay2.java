package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	RemoteWebDriver	rwd =new ChromeDriver();
	File src = rwd.getScreenshotAs(OutputType.FILE);
	//define way for storing screenshot
	File dest = new File("./Screenshot/seleniumss.png");
	//store the ss in to dest
	Files.copy(src, dest);

	}

}

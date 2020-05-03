package driverFactory;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	Browser browser;
	
	static WebDriver driver;
	static File file;
	
	final static String DirPath= "src/test/java/resources/";
	
	public static WebDriver getDriver(Browser browser) {
	
		switch(browser) {
		case CHROME:
			file = new File(DirPath+"chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			driver = new ChromeDriver();
			break;
		case EDGE:
			file = new File(DirPath+"IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver",file.getAbsolutePath());
			break;
		case FIREFOX:
			file = new File (DirPath+"geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			break;
			
		}
		 return driver;
		}

}

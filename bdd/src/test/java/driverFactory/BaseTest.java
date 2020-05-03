package driverFactory;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.util.Properties;

public class BaseTest {

    protected static WebDriver driver;
    static Properties properties = new Properties();

/*
   public BaseTest() throws IOException {

            this.driver = getDriver();
    }
*/

/*
protected BaseTest()

	{
		this.driver = DriverFactory.getDriver(PropertyReader.getBrowser());
	}

*/

    public static WebDriver getDriver() throws IOException {


      //  driver = DriverFactory.getDriver(PropertyReader.getBrowser());
        FileInputStream fis = new FileInputStream("src\\test\\java\\resources\\global.properties");
        properties.load(fis);
        driver = DriverFactory.getDriver(Browser.valueOf(properties.getProperty("browser")));

        return driver;



    }

    public static void getHomePage() throws IOException {

     //   FileInputStream fis = new FileInputStream("src\\test\\java\\resources\\global.properties");
       driver.get(properties.getProperty("url"));
    }

}

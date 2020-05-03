package driverFactory;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class PropertyReader {
	
	
	
	
	public static Browser getBrowser() {
		return Browser.valueOf(getProperty("browser"));
	}


	
	private static String getProperty(String propertyName) {
		
		if (System.getProperty(propertyName) != null) {
			
		return System.getProperty(propertyName);
		}
		
		else {
			return getPropertyFromFile(propertyName);
		}
		
	}
	
	private static String getPropertyFromFile(String propertyName) {
		
		Properties prop;
		prop = new Properties();
		
		InputStream input = null;
		
		try {
			input = new FileInputStream("src/test/java/resources/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			prop.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(input != null)
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
		return null;
	}



}

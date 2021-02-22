package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileReader {

	
	
	public static String propertyfilepath = "autoTestProperties.properties";
	public static Properties properties;

	public PropertyFileReader() {
		properties = new Properties();
		try {
			FileInputStream file = new FileInputStream(propertyfilepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

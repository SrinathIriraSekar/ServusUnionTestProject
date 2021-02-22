package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebdriverManager {


	PropertyFileReader properties = new PropertyFileReader();
	private WebDriver driver;
	
	public WebDriver getBrowserCapabilities(String driverParameter) {
		
		if(driverParameter == null || "chrome".equalsIgnoreCase(driverParameter)) {
			String chromePath = PropertyFileReader.properties.getProperty("chrompath");
			System.out.println("chromePath :: "+chromePath);
			String url = PropertyFileReader.properties.getProperty("url");
					System.setProperty("webdriver.chrome.driver","C://Users//15483//chromedriver.exe");
			driver = new ChromeDriver();
			
				
		}
		else {
			
		}
		
		return driver;
		
		
	}
	public void initialize() {
		driver.get("file:///C:/Users/15483/Downloads/index.html");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}
	
	public void reporting() {
		JVMReport.makeJVMReport(System.getProperty("user.dif"+"\\target\reports.json"));
	}
	

}

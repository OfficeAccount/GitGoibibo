package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	public static WebDriver driver; 
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\AW5044309\\GoibiboAutomation\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AW5044309\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	
		return driver;

	}
	
	public WebDriver tearDown() {
		
		driver.close();
		return driver;
	}
	
	public void getScreenshot(WebDriver driver, String filename) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File( "C://test//"+filename+"ss.png"));
	}

}

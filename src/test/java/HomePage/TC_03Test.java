package HomePage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TC_03;
import resources.Base;

public class TC_03Test extends Base {

	public WebDriver driver;

	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initialized for 3rd test case");
	}

	@Test
	public void logoValidation() {

		TC_03 tc03 = new TC_03(driver);

		tc03.logo();
		String text = driver.getTitle();
		if (text.contains("Best Travel Website")) {
			log.info("	Directed successfully to HomePage");
		} else {
			log.info("	Not directed to homepage");
		}
	}

	@AfterTest
	public void closeBrowser() {

		driver = tearDown();
		log.info("Driver is closed for 3rd test case");
	}
}

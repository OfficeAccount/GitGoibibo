package HomePage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TC_05;
import resources.Base;

public class TC_05Test extends Base {

	public WebDriver driver;

	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized for 5th test case");
	}

	@Test
	public void goCareSupport() {

		TC_05 tc05 = new TC_05(driver);
		tc05.support();
		String errorMessage= tc05.errorMsg();
		log.info("	"+ errorMessage);

	}

	@AfterTest
	public void closeBrowser() {

		driver = tearDown();
		log.info("Driver is closed for 5th test case");
	}

}

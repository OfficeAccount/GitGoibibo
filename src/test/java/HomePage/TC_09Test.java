package HomePage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TC_09;
import resources.Base;

public class TC_09Test extends Base {

	public WebDriver driver;
	public static Logger log= LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized for 9th test case");
	}

	@Test
	public void offersSection() {

		TC_09 tc09 = new TC_09(driver);
		String parentWindow = driver.getWindowHandle();

		tc09.offers();
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains(("Offers"))) {
			log.info("	Navigated to Offers section");
		} else {
			log.info("	Please check the link for new offers");
		}

		driver.switchTo().window(parentWindow);
		log.info("	"+ driver.getTitle());

	}

	@AfterTest
	public void closeBrowser() {

		driver = tearDown();
		log.info("Driver is closed for 9th test case");
	}
}

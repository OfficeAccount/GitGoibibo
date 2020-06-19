package HomePage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TC_08;
import resources.Base;

public class TC_08Test extends Base {

	WebDriver driver;
	public static Logger log= LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initialized for 8th test case");
	}

	@Test
	public void HoverOffers() {

		TC_08 tc08 = new TC_08(driver);
		tc08.nextButton();
		String nextValue = tc08.getAttributeNext();

		while (!(nextValue.contains("opacity: 0.5"))) {
			tc08.nextButton();
			log.info("	"+ tc08.getAttributeNext());
			if (tc08.getAttributeNext().contains("opacity: 0.5")) {

				break;
			}
		}
		log.info("	Hoevered through all forward links successfully");

		tc08.previousButton();
		String previousValue = tc08.getAttributePrevious();

		while (!(previousValue.contains("opacity: 0.5"))) {
			tc08.previousButton();
			log.info("	"+ tc08.getAttributePrevious());
			if (tc08.getAttributePrevious().contains("opacity: 0.5")) {
				break;
			}

		}
		log.info("	Hovered through all back links successfully");
	}

	@AfterTest
	public void closeBrowser() {

		driver = tearDown();
		log.info("Driver is closed for 8th test case");
	}

}

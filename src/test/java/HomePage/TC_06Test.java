package HomePage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TC_06;
import resources.Base;

public class TC_06Test extends Base {

	public WebDriver driver;
	public static Logger log= LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initialized for 6th test case");

	}

	@Test
	public void earnCredits() {

		TC_06 tc06 = new TC_06(driver);

		Boolean value= tc06.goCashLink();

		/*
		 * if (value) { System.out.println(driver.getTitle());
		 * 
		 * System.out.println("Navigated correctly to goCash section"); } else {
		 * System.out.println("Please check the link again"); }
		 */
		Assert.assertTrue(value, "Please check the link again");
		log.info("	Navigated correctly to goCash section");

	}

	@AfterTest
	public void closeBrowser() {

		driver = tearDown();
		log.info("Driver is closed for 6th test case");
	}
}

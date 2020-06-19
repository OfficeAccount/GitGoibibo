package HomePage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TC_01;
import resources.Base;

public class TC_01Test extends Base {

	public WebDriver driver;
	
	public static Logger log= LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initialized for 1st test case");
	}

	// Sign In functionality
	@Test
	public void SignIn() throws InterruptedException {

		TC_01 tc02 = new TC_01(driver);
		tc02.siginLink();
		System.out.println(driver.getWindowHandle());
		driver.switchTo().frame("authiframe");
		System.out.println(driver.getWindowHandle());
		tc02.mobileNumber();
		driver.switchTo().defaultContent();
		System.out.println(driver.getWindowHandle());
		tc02.closePopup();
		log.info("	SignIn tested ");

	}

	// SignUp functionality
	@Test
	public void SignOut() {
		TC_01 tc01 = new TC_01(driver);
		tc01.sigupLink();
		driver.switchTo().frame("authiframe");
		tc01.mobileNumber();
		driver.switchTo().defaultContent();
		tc01.closePopup();
		log.info("	Signout tested ");

	}

	@AfterTest
	public void closeBrowser() {
		driver = tearDown();
		log.info("Driver closed for 1st test case");
	}

}

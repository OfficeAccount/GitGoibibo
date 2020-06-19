package HomePage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TC_11;
import resources.Base;

public class TC_11Test extends Base {

	public WebDriver driver;
	public static Logger log= LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized for 11th test case");
	}

	@Test
	public void productsSection() {

		TC_11 tc11 = new TC_11(driver);
		String parentWindow = driver.getWindowHandle();

		// Actions action=new Actions(driver);
		// action.moveToElement(products).click().perform();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", tc11.products());

		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		String title = driver.getTitle();
		log.info("	Title:- "+ title);
		if (title.contains(("Features"))) {
			log.info("	Navigated to Features section");
		} else {
			log.info("	Please check the link for new features");
		}

		driver.switchTo().window(parentWindow);
		log.info("	Title:- "+ driver.getTitle());
	}

	@AfterTest
	public void closeBrowser() {

		driver = tearDown();
	}

}

package HomePage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TC_10;
import resources.Base;

public class TC_10Test extends Base {

	public WebDriver driver;
	public static Logger log= LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.manage().window().maximize();
		log.info("Driver is initialized for 10th test case");
	}

	@Test
	public void HoverProducts() throws InterruptedException {

		TC_10 tc10 = new TC_10(driver);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,900)");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(tc10.nextButton));
		tc10.nextButton();
		String nextValue = tc10.getAttributeNext();

		while (!(nextValue.contains("opacity: 0.5"))) {
			tc10.nextButton();
			log.info("	"+ tc10.getAttributeNext());

			if (tc10.getAttributeNext().contains("opacity: 0.5")) {

				break;
			}

		}
		log.info("	Hovered all forward links successfully");

		tc10.previousButton().click();
		String previousValue = tc10.getAttributePrevious();

		while (!(previousValue.contains("opacity: 0.5"))) {
			tc10.previousButton().click();
			log.info("	"+ tc10.getAttributePrevious());
			if (tc10.getAttributePrevious().contains("opacity: 0.5")) {

				break;
			}

		}
		log.info("	Hoevered all backward links successfully");

	}

	@AfterTest
	public void closeBrowser() {

		driver = tearDown();
		log.info("Driver is closed for 10th test case");
	}

}

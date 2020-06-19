package HomePage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TC_02;
import resources.Base;

public class TC_02Test extends Base {

	public WebDriver driver;

	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized for 2nd test case");
	}

	@Test
	public void headerValidation() {

		TC_02 tc02 = new TC_02(driver);

		List<WebElement> subLinks = tc02.headerAnchorTags();
		int totalLinks = subLinks.size();

		for (int i = 0; i < totalLinks; i++) {
			subLinks.get(i).sendKeys(Keys.CONTROL, Keys.ENTER);
		}
		
		Set<String> allLinks = driver.getWindowHandles();
		Iterator<String> it = allLinks.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			if ((driver.getTitle()).contains(driver.getCurrentUrl())) {
				
				log.info("	"+ driver.getTitle()+ "- Link Validated");
			} else {
				
				log.info("	please check this link: " + driver.getCurrentUrl() + " " + driver.getTitle());
			}
		}

	}

	@AfterTest
	public void closeBrowser() {

		driver = tearDown();
		log.info("Driver is closed for 2nd test case");
	}
}

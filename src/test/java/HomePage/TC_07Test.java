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

import pageObjects.TC_07;
import resources.Base;

public class TC_07Test extends Base {

	WebDriver driver;
	public static Logger log= LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized for 7th test case");
	}

	@Test
	public void footerLinks() {

		TC_07 tc07 = new TC_07(driver);
		List<WebElement> list = tc07.anchorTags();
		for (int i = 0; i < list.size(); i++) {
			list.get(i).sendKeys(Keys.CONTROL, Keys.ENTER);
		}
		String parent = driver.getWindowHandle();
		Set<String> allScreens = driver.getWindowHandles();
		Iterator<String> it = allScreens.iterator();

		while (it.hasNext()) {
			String nextScreens = it.next();
			if (!(nextScreens.equals(parent))) {
				driver.switchTo().window(nextScreens);
				log.info("	Title:-  "+ driver.getTitle());
				driver.close();
			}
			

		}

	}

	@AfterTest
	public void closeBrowser() {

		driver = tearDown();
		log.info("Driver is closed for 7th test case");
	}

}

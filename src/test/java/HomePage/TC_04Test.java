package HomePage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TC_04;
import resources.Base;

public class TC_04Test extends Base {

	public WebDriver driver;

	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initialized for 4th test case");
	}

	@Test
	public void UserOptions() {

		TC_04 tc04 = new TC_04(driver);
		Actions action = new Actions(driver);
		action.moveToElement(tc04.userPicture()).perform();

		for (int i = 0; i < tc04.tags().size(); i++) {

			tc04.tags().get(i).sendKeys(Keys.CONTROL, Keys.ENTER);

		}

		String first = driver.getWindowHandle();
		Set<String> parent = driver.getWindowHandles();
		Iterator<String> iternate = parent.iterator();

		while (iternate.hasNext()) {

			String compare = iternate.next();

			if (!(compare.contains(first))) {
				driver.switchTo().window(compare);
				log.info("	"+ driver.getTitle() + " " + compare.toString() + " " + first.toString());
				driver.close();
			}
		}
		driver.switchTo().window(first);
		log.info("	"+ driver.getTitle());
	}

	@AfterTest
	public void closeBrowser() {

		driver = tearDown();
		log.info("Driver is closed for 4th test case");
	}

}

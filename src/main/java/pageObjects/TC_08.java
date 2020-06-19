package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_08 {

	public WebDriver driver;

	public TC_08(WebDriver driver) {

		this.driver = driver;
	}

	// WebElement nextButton =
	// driver.findElement(By.xpath("//div[@class='slider-decorator-1']/span"));
	// String nextValue =
	// driver.findElement(By.xpath("//div[@class='slider-decorator-1']/span")
	// driver.findElement(By.xpath("//div[@class='slider-decorator-1']/span")
	// WebElement previousButton =
	// driver.findElement(By.xpath("//div[@class='slider-decorator-0']/span")

	By nextButton = By.xpath("//div[@class='slider-decorator-1']/span");
	By previousButton = By.xpath("//div[@class='slider-decorator-0']/span");

	public void nextButton() {
		driver.findElement(nextButton).click();
	}

	public String getAttributeNext() {
		return driver.findElement(nextButton).getAttribute("style");
	}

	public String getAttributePrevious() {
		return driver.findElement(previousButton).getAttribute("style");
	}

	public void previousButton() {
		driver.findElement(previousButton).click();
	}
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_10 {
	
	public WebDriver driver;
	
	public TC_10(WebDriver driver) {
		this.driver=driver;
	}
	
	//driver.findElement(By.xpath("(//div[@class='slider-decorator-1'])[2]/span")
	
	public By nextButton=By.xpath("(//div[@class='slider-decorator-1'])[2]/span");
	By previousButton=By.xpath("(//div[@class='slider-decorator-0'])[2]/span");
	
	public void nextButton() {
		driver.findElement(nextButton).click();
	}
	
	public WebElement previousButton() {
		return driver.findElement(previousButton);
	}
	public String getAttributeNext() {
		return driver.findElement(nextButton).getAttribute("style");
	}

	public String getAttributePrevious() {
		return driver.findElement(previousButton).getAttribute("style");
	}

}

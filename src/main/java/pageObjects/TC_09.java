package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_09 {
	
	public WebDriver driver;
	
	public TC_09(WebDriver driver) {
		this.driver=driver;
	}
	
	By offers= By.xpath("//a[@href='https://www.goibibo.com/offers/flight-offers/']");
	
	public void offers() {
		driver.findElement(offers).click();
	}

}

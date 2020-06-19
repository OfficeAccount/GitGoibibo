package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_05 {

	public WebDriver driver;

	public TC_05(WebDriver driver) {
		this.driver = driver;

	}

	// driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-4 col-xs-6 fr pad0
	// txtRight']/span/a")).click();
	// driver.findElement(By.xpath("//div[@class=\"custBkngInner\"]/div/span/span")

	By support = By.xpath("//div[@class='col-md-4 col-sm-4 col-xs-6 fr pad0 txtRight']/span/a");
	By errorMsg = By.xpath("//div[@class=\"custBkngInner\"]/div/span/span");

	public void support() {
		driver.findElement(support).click();
	}

	public String errorMsg() {

		return driver.findElement(errorMsg).getText();
		
	}

}

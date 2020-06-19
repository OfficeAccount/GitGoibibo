package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_02 {
	
	public WebDriver driver;
	
	public TC_02(WebDriver driver) {
		this.driver=driver;
	}
	
	
	//WebElement mainLinks = driver.findElement(By.xpath("//div[@class='col-md-8 col-sm-8 col-xs-6 pad0 marginT5']/ul"));
	//List<WebElement> subLinks = mainLinks.findElements(By.tagName("a"));
	
	By headerLinks= By.xpath("//div[@class='col-md-8 col-sm-8 col-xs-6 pad0 marginT5']/ul");
	By headerAnchorTags=By.tagName("a");
	
	public WebElement headerLinks() {
		return driver.findElement(headerLinks);
	}
	
	public List<WebElement> headerAnchorTags() {
		return headerLinks().findElements(headerAnchorTags);
	}
}

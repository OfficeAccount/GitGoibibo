package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_07 {
	
	public WebDriver driver;
	
	public TC_07(WebDriver driver) {
		this.driver=driver;
	}
	
	//WebElement completeList= driver.findElement(By.xpath("//div[@class='col-md-10 col-sm-12 padB20']"));
	//completeList.findElements(By.tagName("a")
	By footerSection= By.xpath("//div[@class='col-md-10 col-sm-12 padB20']");
	By anchorTags= By.tagName("a");
	
	
	public WebElement footerSection() {
		return driver.findElement(footerSection);
	}
	
	public List<WebElement> anchorTags() {
		return footerSection().findElements(anchorTags);
	}
}

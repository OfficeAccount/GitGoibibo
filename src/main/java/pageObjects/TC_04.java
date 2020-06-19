package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_04 {
	
	public WebDriver driver;
	public TC_04(WebDriver driver) {
		this.driver=driver;
	}
	
	//	WebElement userPhoto=driver.findElement(By.xpath("//div[@class='userPhoto']"));
	//WebElement userLinks=driver.findElement(By.xpath("//div[@class='tip tip_top right white moreSubLinks']/ul"));
	//userLinks.findElements(By.tagName("a"))
	
	By userPic=By.xpath("//div[@class='userPhoto']");
	By userLink= By.xpath("//div[@class='tip tip_top right white moreSubLinks']/ul");
	By tags= By.tagName("a");
	
	public WebElement userPicture() {
		return driver.findElement(userPic);
	}
	
	public WebElement userLinks() {
		return driver.findElement(userLink);
	}
	
	public List<WebElement> tags() {
		return userLinks().findElements(tags);
	}
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_03 {
	
	public WebDriver driver;
	
	
	public TC_03(WebDriver driver) {
		this.driver=driver;
	}
	
	//driver.findElement(By.xpath("//a[@class='hdrLogo']"))
	By logo= By.xpath("//a[@class='hdrLogo']");
	
	public void logo() {
		driver.findElement(logo).click();
	}

}

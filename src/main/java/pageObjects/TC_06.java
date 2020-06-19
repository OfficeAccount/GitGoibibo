package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_06 {
	
	public WebDriver driver;
	
	public TC_06(WebDriver driver){
		this.driver=driver;
	}
	//driver.findElement(By.xpath("//a[@href='/info/gocash-benefits/']"));
	
	By goCashLink= By.xpath("//a[@href='/info/gocash-benefits/']");
	
	
	public boolean goCashLink() {
		
		driver.findElement(goCashLink).click();
		boolean value = driver.getCurrentUrl().contains("gocash-benefits");
		return value;
	}
	
}

package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_11 {

	public WebDriver driver;
	
	public TC_11(WebDriver driver) {
		this.driver=driver;
	}
	
	//driver.findElement(By.xpath("//div[@class='txtCenter flexCol alignItemsCenter ']/a")
	
	By products=By.xpath("//div[@class='txtCenter flexCol alignItemsCenter ']/a");
	
	
	public WebElement products() {
		return driver.findElement(products);
	}
}

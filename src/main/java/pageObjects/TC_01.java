package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_01 {

	public WebDriver driver;

	public TC_01(WebDriver driver) {
		this.driver = driver;
	}

	// driver.findElement(By.xpath("//a[@id='get_sign_in']"))

	// mobileNumber= driver.findElement(By.xpath("//input[@id='authMobile']")

	// driver.findElement(By.id("mobileSubmitBtn"))

	// driver.findElement(By.xpath("//div[@class='popContent']/a"))

	By signinLink = By.xpath("//a[@id='g']");
	By signupLink = By.xpath("//a[@id='get_sign_up']");
	By mobileNumber = By.xpath("//input[@id='authMobile']");
	By submitButton = By.id("mobileSubmitBtn");
	By closePopup = By.xpath("//div[@class='popContent']/a");

	public void siginLink() {

		driver.findElement(signinLink).click();
	}
	
	public void sigupLink() {

		driver.findElement(signupLink).click();
	}

	public void mobileNumber() {

		driver.findElement(mobileNumber).sendKeys("8446554756");
		driver.findElement(submitButton);
	}

		public void closePopup() {

		driver.findElement(closePopup).click();
	}
}

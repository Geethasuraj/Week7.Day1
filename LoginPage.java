package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(how=How.ID, using="username") WebElement eleUserName;
	// action+elementName
	public LoginPage enterUsername(String username) throws InterruptedException {
		//driver.findElement(By.id("username")).sendKeys(username);
		//Thread.sleep(5000);
		eleUserName.sendKeys(username);
				return this;
	}
	@FindBy(how=How.ID, using="password") WebElement elePassWord;
	public LoginPage enterPassword(String password) {
		//driver.findElement(By.id("password")).sendKeys(password);
		elePassWord.sendKeys(password);
		return this;
	}
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogin;

	public HomePage clickLoginButton() {
		//driver.findElement(By.className("decorativeSubmit")).click();
			eleLogin.click();
		return new HomePage(driver);

	}

}

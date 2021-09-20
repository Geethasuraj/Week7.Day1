package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	public EditLeadPage(ChromeDriver driver) {
		this.driver = driver;
			}
	
	public EditLeadPage clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	
	public EditLeadPage enterPhoneNumber(String phNo) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
		return this;
	}
	
	public EditLeadPage clickFindLeadsButton() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	return this;
	}
	
	public ViewLeadPage clickOnTheLink() {
	 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	
	return new ViewLeadPage(driver);
	}
	
	public EditLeadPage clickOnEdit() {
		driver.findElement(By.linkText("Edit")).click();
		return this;
	}
	 public EditLeadPage enterCompanyName(String company) {
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
	return this;
	 }
	 public ViewLeadPage clickonSubmit() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
	 }
	
}

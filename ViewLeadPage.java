package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;

	}

	public ViewLeadPage verifyFirstName() {
		System.out.println("FirstName displayed");
		return this;

	}

	
		public EditLeadPage clickOnEdit() {
			driver.findElement(By.linkText("Edit")).click();
			return new EditLeadPage(driver);
		}
		
		public DuplicateLeadPage clickOnDuplicate() {
			driver.findElement(By.linkText("Duplicate Lead")).click();
			return new DuplicateLeadPage(driver);
		}
		
		
		public MyLeadsPage clickOnDelete() {
			// TODO Auto-generated method stub
			driver.findElement(By.linkText("Delete")).click();
			return new MyLeadsPage(driver);
			
		}

	
	}


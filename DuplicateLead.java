package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DuplicateLead extends ProjectSpecificMethods {
	
	

	@Test
	public void runDuplicateLead() throws InterruptedException {
		new LoginPage(driver)
		.enterUsername("Demosalesmanager")
		.enterPassword("crmsfa")
		.clickLoginButton()
		.clickCrmSFA()
		.clickLeadsLink()
		.clickEditLeadLInk()
		.clickPhone()
		.enterPhoneNumber("99")
		.clickFindLeadsButton()
		.clickOnTheLink()
		.clickOnDuplicate()
		.clickonSubmit();
	}
	

}

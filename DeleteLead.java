package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;


public class DeleteLead extends ProjectSpecificMethods{
	@Test
	public void runDeleteLead() throws InterruptedException {
		new LoginPage(driver).enterUsername("Demosalesmanager").enterPassword("crmsfa").clickLoginButton()
		.clickCrmSFA().clickLeadsLink().clickEditLeadLInk().clickPhone().enterPhoneNumber("99")
		.clickFindLeadsButton().clickOnTheLink().clickOnDelete();
		
	}
}
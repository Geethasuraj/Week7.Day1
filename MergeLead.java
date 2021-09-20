package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class MergeLead extends ProjectSpecificMethods{
	@Test
	public void runMergeLead() throws InterruptedException {
		new LoginPage(driver)
		.enterUsername("Demosalesmanager")
		.enterPassword("crmsfa")
		.clickLoginButton()
		.clickCrmSFA()
		.clickLeadsLink()
		.clickMergeLead()
		.clickOnFirstLookUp()
		.clickOnSecondLookUp()
		.clickOnMerge();
		
	}

}

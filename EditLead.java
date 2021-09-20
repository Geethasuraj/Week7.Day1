package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setFileName() {
		fileName = "EditLead";
	}

	@Test(dataProvider = "sendData")
	public void runEditLead(String username, String password, String phNo, String company) throws InterruptedException {
		new LoginPage(driver).enterUsername(username).enterPassword(password).clickLoginButton().clickCrmSFA()
				.clickLeadsLink().clickEditLeadLInk().clickPhone().enterPhoneNumber(phNo).clickFindLeadsButton()
				.clickOnTheLink().clickOnEdit().enterCompanyName(company).clickonSubmit();
	}
}

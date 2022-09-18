package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;

public class VerifyLoginTestCase extends BaseClass {


	@Test
	public void login() throws IOException {
		browserLaunch();
	//this driver have scope
		driver.get("https://login.salesforce.com/?locale=in");
	LoginPageObject lpo=new LoginPageObject(driver);
	
	lpo.EnterUsername().sendKeys("rahul");
	lpo.EnterPassword().sendKeys("123");
   lpo.ClickLogin().click();
	
	}




}

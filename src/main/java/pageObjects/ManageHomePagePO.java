package pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import commons.AbstractPage;
import pageUIs.ManageHomePageUI;

public class ManageHomePagePO extends AbstractPage{
	WebDriver driver;

	public ManageHomePagePO(WebDriver driver) {
		this.driver = driver;
	}
	public void homePageURL()  {
		Assert.assertEquals(getCurrentPageUrl(driver), ManageHomePageUI.EXPECTED_HOME_PAGE_UI); 
	}
	
}

package stepsDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import pageObjects.ManageHomePagePO;
import pageObjects.PageGeneratorManager;
import pageUIs.ManageHomePageUI;

public class HomePageSteps {
	ManageHomePagePO homePage;
	public HomePageSteps(WebDriver driver) {
		this.driver = Hooks.openAndQuitBrowser() ;
		homePage = PageGeneratorManager.getManageHomePage(driver);
	}
	WebDriver driver;
	
	@Then("^Home page display$")
	public void homePageDisplay()  {
		homePage.homePageURL();
	}

}

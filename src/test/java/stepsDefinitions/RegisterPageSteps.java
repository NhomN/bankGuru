package stepsDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commons.DataHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.PageGeneratorManager;
import pageObjects.RegisterPO;

public class RegisterPageSteps {
	WebDriver driver;
	RegisterPO registerPage;
	DataHelper dataTest;
	String userName, passWord, loginPageUrl;
	public RegisterPageSteps(WebDriver driver) {
		driver = Hooks.openAndQuitBrowser();
		registerPage = PageGeneratorManager.getRegisterPage(driver);
		dataTest= DataHelper.getFakeData();
	}

	@When("^Input to email ID$")
	public void inputToEmailID()  {
	    registerPage.enterToTextboxByName(driver, dataTest.getEmailAddress(), "emailid");
	    
	}

	@When("^I click to Submit button$")
	public void iClickToSubmitButton()  {
		registerPage.clickToButtonByValue(driver, "Submit");
	    
	}

	@Then("^Get User and password infor$")
	public void getUserAndPasswordInfor()  {
	    userName = registerPage.getUserIDValue();
	    passWord = registerPage.getPasswordValue();   
	}

	@When("^Back to Login page$")
	public void backToLoginPage()  {
		registerPage.backtoLoginPage();
	    
	}
	@Given("^Get Login Page Url$")
	public void getLoginPageUrl()  {
		loginPageUrl = registerPage.getCurrentPageUrl(driver);
	}   
	
	@When("^Open Register Page$")
	public void openRegisterPage()  {
	    registerPage.clickToHereLink();
	}
	@When("^Submit valid infor to login form$")
	public void submitValidInforToLoginForm()  {
	    registerPage.enterToTextboxByName(driver, userName, "uid");
	    registerPage.enterToTextboxByName(driver, passWord, "password");
	}


}

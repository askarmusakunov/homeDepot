package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import utilities.Config;
import utilities.Driver;
import utilities.Page;
import static utilities.Driver.getDriver;
public class SignInTest {
	
	HomePage homePage;
	Actions action;
	@Given("^I am on the HomeDepot home page$")
	public void i_am_on_the_HomeDepot_home_page()  {
	    action = new Actions(getDriver());
	    homePage = new HomePage(getDriver());
	    getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    getDriver().get(Config.getProperty("baseURL"));
	    Assert.assertEquals("HomePage title verification failed", Config.getProperty("homeTitle"), getDriver().getTitle());
	}

	@When("^I login as a user$")
	public void i_login_as_a_user()  {
	    homePage.sign_in(Config.getProperty("userEmail"), Config.getProperty("userPassword"));
	}

	@Then("^I should be able to verify that I logged in$")
	public void i_should_be_able_to_verify_that_I_logged_in()  {
		Page.sleep(3000);
		System.out.println(homePage.welcomeTitle.getText());
	    Assert.assertEquals("Welcome",homePage.welcomeTitle.getText());
	}
	
	@When("^I hover over Shopping links$")
	public void i_hover_over_Shopping_links() throws Throwable {
		for(int i = 0; i < 6; i++) {
		homePage.hoverOverShoppingLinks(i);
		}
	}

	@Then("^I should be able to see dropDowns$")
	public void i_should_be_able_to_see_dropDowns() {
	    action.moveToElement(homePage.rugsLink).perform();
	}

	
}

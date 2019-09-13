package steps;

import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.LoginPage;
import pages.actions.SideMenu;
import utilities.SeleniumDriver;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage();
	SideMenu sideMenu = new SideMenu();
	
	@Given("^I on the Login Page \"([^\"]*)\"$")
	public void i_on_the_Login_Page(String url) throws Throwable {
//		SeleniumDriver.openPage("http://499.wordpress.imunify.local/wp-login.php");
		SeleniumDriver.openPage(url);
	}

	@When("^I set login as \"([^\"]*)\"$")
	public void i_set_login_as(String login) throws Throwable {
		loginPage.setLogin(login);
	}

	@And("^I set password as \"([^\"]*)\"$")
	public void i_set_password_as(String pass) throws Throwable {
		loginPage.setPass(pass);
	}

	@And("^I click on LogIn button$")
	public void i_click_on_LogIn_button() throws Throwable {
		loginPage.clickSignInButton();
	}
	
	@Then("^I validate the Dashboard that text \"([^\"]*)\" is present$")
	public void i_validate_the_Dashboard_that_text_is_present(String text) throws Throwable {
		SeleniumDriver.assertTextPresent(text);
	}

	@And("^I validate the SideMenu items$")
	public void i_validate_the_SideMenu_items() throws Throwable {
		Assert.assertEquals(sideMenu.findMenusCount(), 8);
	}
}

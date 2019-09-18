package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import pages.actions.GeneralSettingsPage;
import pages.actions.SideMenu;
import utilities.SeleniumDriver;

public class GeneralSettingsEditingSteps {
	
	SideMenu sideMenu = new SideMenu();
	GeneralSettingsPage settings = new GeneralSettingsPage();
	
	@Then("^I click on goToSettings button$")
	public void i_click_on_goToSettings_button() throws Throwable {
		sideMenu.goToSettings();
	}

	@Then("^I clear Title$")
	public void i_clear_Title() throws Throwable {
		settings.clearTitle();
	}

	@Then("^I set new title \"([^\"]*)\"$")
	public void i_set_new_title(String title) throws Throwable {
		settings.setSiteTitle(title);
	}

	@Then("^I click on Save button$")
	public void i_click_on_Save_button() throws Throwable {
		settings.saveButtonClick();
	}

	@Then("^I goToWPlocal$")
	public void i_goToWPlocal() throws Throwable {
		sideMenu.goToWPlocal();
	}

	@Then("^I validate the Page title has text \"([^\"]*)\"$")
	public void i_validate_the_Page_title_has_text(String text) throws Throwable {
		SeleniumDriver.assertTextPresent(text);
	}

}

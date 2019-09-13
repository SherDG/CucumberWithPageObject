package pages.actions;

import pages.locators.WP499LoginPageLocators;
import pages.locators.WP499SettingsPageLocators;
import utilities.SeleniumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class GeneralSettingsPage{
	
	public WP499SettingsPageLocators settings;
	

	public GeneralSettingsPage() {
		this.settings = new WP499SettingsPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(SeleniumDriver.getDriver(), 10);
		PageFactory.initElements(factory,this.settings);
	}

	public void setSiteTitle(String newtitle) {
		settings.siteTitleInput.clear();		
		settings.siteTitleInput.sendKeys(newtitle);
		settings.saveButton.click();	
	}
}

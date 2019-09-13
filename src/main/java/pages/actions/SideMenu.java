package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


import pages.locators.WP499SettingsPageLocators;
import pages.locators.WP499SideMenuLocators;
import utilities.SeleniumDriver;


public class SideMenu{
	
	public WP499SideMenuLocators menu;

	public SideMenu() {
		this.menu = new WP499SideMenuLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(SeleniumDriver.getDriver(), 10);
		PageFactory.initElements(factory,this.menu);
	}
	
	public GeneralSettingsPage goToSettings() {
		menu.Settings.click();	
//		Page.click(menu.Settings);
		return new GeneralSettingsPage();
	}
	
	public WP499Local goToWPlocal() {
		SeleniumDriver.openPage("http://499.wordpress.imunify.local/");
		return new WP499Local();
	}
	
	public int findMenusCount() {		
		return menu.sideMenuCount.size();
	}
	
}

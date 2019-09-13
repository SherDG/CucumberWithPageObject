package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WP499SettingsPageLocators {
	@FindBy(css="#blogname")
	public WebElement siteTitleInput;
	
	@FindBy(css="#submit")
	public WebElement saveButton;	
	

}

package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WP499UserUILocators {
//	User UI
	@FindBy(css="div.site-branding a")
	public WebElement siteHeader_CSS;
	
	@FindBy(xpath="//*[@id=\"masthead\"]//h1/a")
	public WebElement pageHeader_XPATH;
}

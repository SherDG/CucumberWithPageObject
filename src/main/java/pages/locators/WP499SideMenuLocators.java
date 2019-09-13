package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WP499SideMenuLocators {
	@FindBy(css="#menu-settings > a")
	public WebElement Settings;
	
	@FindBy(css="#menu-posts > a")
	public WebElement Posts;
	
	@FindBy(xpath="//li[starts-with(@class,'wp-has')]")
	public List<WebElement> sideMenuCount;
	
	
}

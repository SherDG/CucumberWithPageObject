package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class WP499LoginPageLocators {
	
	@FindAll({
		@FindBy(css="#user_login"),
		@FindBy(id="user_login")})
	public WebElement usermaneInput;	
	
	
	@FindBys({ //ищет сначала первый элемент потом второй внутри первого
		@FindBy(css="#loginform"),
		@FindBy(css="#user_pass")})
	public WebElement passInput;
	
	@FindBy(css="#wp-submit")
	public WebElement logInButton;
}

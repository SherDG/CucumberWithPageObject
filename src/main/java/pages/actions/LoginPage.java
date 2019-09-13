package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.WP499LoginPageLocators;
import utilities.SeleniumDriver;

public class LoginPage {

	
	public WP499LoginPageLocators login=null;
	
	public LoginPage() {
		this.login = new WP499LoginPageLocators();
		
//		PageFactory.initElements(SeleniumDriver.getDriver(),this.login);
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(SeleniumDriver.getDriver(), 10);
		PageFactory.initElements(factory,this.login);
	}

	public void setLogin(String admin) {
		login.usermaneInput.sendKeys(admin);		
		}
	
	public void setPass( String pass) {		
		login.passInput.sendKeys(pass);		
		}
	
	public void clickSignInButton() {		
		login.logInButton.click();
		}
	
	

}

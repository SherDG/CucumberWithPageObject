package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
//import utils.SeleniumDriver;
import cucumber.api.java.Before;
import utilities.SeleniumDriver;

public class BeforeActions {

		@Before
		public static void setUp() {
			
			
			
			SeleniumDriver.setUpDriver();
		}
		
}

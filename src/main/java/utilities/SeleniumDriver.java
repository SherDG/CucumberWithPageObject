package utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

//import com.relevantcodes.extentreports.LogStatus;

public class SeleniumDriver {
	private static SeleniumDriver seleniumDriver;
	
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT =30;
	public final static int PAGE_LOAD_TIMEOUT =30;
	
	private SeleniumDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(seleniumDriver==null) {
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}
	
	public static boolean assertTextPresent(String text) throws IOException{		
		try{
			Assert.assertTrue(driver.getPageSource().contains(text));
			return true;
		} catch (Throwable t) {			
			
//			TestUtil.captureScreeshot();
//			// ReportNG
//			Reporter.log("<br>" + "Verification failure : " + t.getMessage() + "<br>");
//			Reporter.log("<a target=\"_blank\" href=" + TestUtil.screeshotName + "><img src=" + TestUtil.screeshotName
//					+ " height=200 width=200></img></a>");
//			Reporter.log("<br>");
//			Reporter.log("<br>");
//			// Extent Reports
//			test.log(LogStatus.FAIL, " Verification failed with exception: " + t.getMessage());
//			test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screeshotName));
			Assert.fail("Test Failed - Text is not present");
			return false;
					}
	}
}

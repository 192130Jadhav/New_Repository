package InitialTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsers.Base;
import POMClasses.SignUpPage;

public class VerificationOfSignInPage {
	WebDriver driver;
	SignUpPage signin;
	@Parameters("browserName")
	@BeforeTest
	public void launchCrossBrowser1(String browser)
	{
		if(browser.equals("Chrome"))
		{
			driver=Base.openCromeBrowser();
		}
	
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void createPOMClassObj1() {
		signin=new SignUpPage(driver);
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginMethod() throws InterruptedException 
	{
		driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
        signin=new SignUpPage(driver);	
        //signin.SelectListbox(driver);
        signin.PassName();
        signin.PassOrgname();
        signin.PassEmail();
        signin.SelectChkbox();
        signin.ClickOnGetstartedBtn();
        Thread.sleep(5000);
	
	}
	@Test
	public void SampleMethod()
	{
		System.out.println("Sample Test");
	}
	
	@AfterMethod(alwaysRun =true)
	public void logoutMethod() 
	{
		System.out.println("logouthere");
	}
	@AfterClass(alwaysRun = true)
	public void clearObj() 
	{
		signin=null;
	}
	@AfterTest
	public void CloseBrowser() {
		driver.close();
		System.out.println("------?????-----");
		driver=null;
		System.gc();
		}
	

}

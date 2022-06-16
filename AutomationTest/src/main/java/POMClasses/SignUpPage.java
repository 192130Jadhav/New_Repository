package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
//	@FindBy (xpath="(//span[@class='btn btn-default form-control ui-select-toggle'])[2]")
//	private WebElement listbox;
//	
//	@FindBy (xpath="(//div[@ng-bind-html='language'])[1]")
//	private WebElement englishLang;
//	
//	@FindBy (xpath="(//div[@ng-bind-html='language'])[2]")
//	private WebElement dutchLang;
	
	@FindBy (xpath="//input[@id='name']")
	private WebElement name;
	
	@FindBy (xpath="//input[@id='orgName']")
	private WebElement orgName;
	
	@FindBy (xpath="//input[@id='singUpEmail']")
	private WebElement email;
	
    @FindBy (xpath="//span[@class='black-color ng-binding']")
	private WebElement chkAgreeConditions;
    
    @FindBy (xpath="//button[@type='submit']")
   	private WebElement getStartedBtn;
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
//	public void SelectListbox(WebDriver driver)
//	{
//		 Actions act=new Actions(driver);
//	     act.moveToElement(listbox).moveToElement(englishLang).click().build().perform();
//		 listbox.click();	
//		   
//	}
	public void PassName()
	{
		name.sendKeys("Kanchan Jadhav");
	}
	public void PassOrgname()
	{
		orgName.sendKeys("abc");
	}
	public void PassEmail()
	{
		email.sendKeys("kanchanvjadhav1991@gmail.com");
	}
	public void SelectChkbox()
	{
		chkAgreeConditions.click();
	}
	public void ClickOnGetstartedBtn()
	{
		getStartedBtn.click();
	}
	///End///
	
	
	

}

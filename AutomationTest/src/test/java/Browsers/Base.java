package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver openCromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumFiles\\chromedriver_win32 (102)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}

}

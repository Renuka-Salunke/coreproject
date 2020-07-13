package co.core.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class TestBase {

	public static WebDriver driver = null;
	
	@BeforeSuite
	public void intialise()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	      
	    driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
        driver.get("https://core.opusconsulting.com/");
	}
	
	@AfterSuite
	public void TeardownTest()
	{
	//	TestBase.driver.quit();
	}
}
	
	//  N>Bd+!s3@

//2430#Shruti


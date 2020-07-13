package co.core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class timesheet {
	WebDriver driver;
	public timesheet(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//time dropdown
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'time')]") WebElement timesheet;
	
	@FindBy(how=How.XPATH, using="//a[@class='dropdown-toggle'][contains(text(),'attendance')]") WebElement drop;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'my attendance')]") WebElement myattendace;
	
	
	public void timesheett()
	{
		timesheet.click();
	}
	
	public void attedance()
	{
		drop.click();
	}
	
	public void myattend()
	{
		myattendace.click();
	}
	
}

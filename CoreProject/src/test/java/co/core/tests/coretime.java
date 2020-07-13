package co.core.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import co.core.pages.Coreloginpage;
import co.core.pages.coreViewDetailpages;
import co.core.pages.timesheet;

public class coretime extends TestBase {

	
	@Test(priority=1)
	public void init() throws InterruptedException
	{
		Coreloginpage loginpage = PageFactory.initElements(driver, Coreloginpage.class);
		loginpage.setEmail("renuka.salunke");
		loginpage.setPassword("N>Bd+!s3@");
		loginpage.clickonloginButton();
		loginpage.clickonlogout();
	
}
	

	@Test(priority=2)
	public void viewcoredet() throws Throwable
	{
		coreViewDetailpages viewdetail = PageFactory.initElements(driver, coreViewDetailpages.class);
		viewdetail.frameview();
		viewdetail.viewdet();
		
		Thread.sleep(3000);
		viewdetail.myskempinfo();
		
		Thread.sleep(4000);
		viewdetail.myskillmenuuuu();
		
	 Thread.sleep(2000);
	   viewdetail.myskillsdeatils();
	    viewdetail.searchdrop("Status", "Pending Approval");
	    viewdetail.approved("Status", "Approved"); 
		   viewdetail.reject("Status", "Reject"); 
		
		   
		Thread.sleep(3000);
		
		viewdetail.homeclickkkk();
		
	    
	}
	
	@Test(priority=3)
	public void timest() throws InterruptedException
	{
		timesheet time = PageFactory.initElements(driver, timesheet.class);
		time.timesheett();
		time.attedance();
		
	}
	
	
}
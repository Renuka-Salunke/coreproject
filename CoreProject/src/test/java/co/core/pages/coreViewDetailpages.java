package co.core.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class coreViewDetailpages {

	WebDriver driver;
	
	 public coreViewDetailpages(WebDriver driver)
	{
		this.driver = driver;
	}
	 
	 //frame
	 @FindBy(how=How.XPATH, using="//iframe[@id='rightMenu']") WebElement frame1;
	 
	 //viewdeatils
	 @FindBy(how=How.XPATH, using="//b[contains(text(),'View Full Details')]") WebElement viewdetails;
	 
	 @FindBy(how=How.XPATH, using="//span[contains(text(),'Employee info')]") WebElement empinfo1;
	 
	//my skills 
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'My Skills')]") WebElement myskillss123;
	 
	 
	//personal info with frame 
	// @FindBy(how=How.XPATH, using="//iframe[@id='rightMenu']") WebElement frame3;
	 
 
 //search by drop
 @FindBy(how=How.XPATH, using="//select[@id='loc_codeNew']") WebElement searchby;
 
 //search for
 @FindBy(how=How.XPATH, using="//select[@id='cmbSkillStatus']") WebElement searchfor;
 
 //search button
 @FindBy(how=How.XPATH, using="//button[contains(text(),'Search')]") WebElement searchbutton;
 

	 
	//homeclick
	// @FindBy(how=How.XPATH, using="//span[contains(text(),'home')]") WebElement homeclick;
	 
	 
	 //leave click
	// @FindBy(how=How.XPATH, using=" //div[@class='row']//div[1]//div[1]//div[2]//div[1]//a[1]//i[1]") WebElement timesheets;
	 
	 
	 
	 public void frameview() throws InterruptedException
	 {
		 Thread.sleep(3000);
		driver.switchTo().frame(frame1);
		 System.out.println("frame1 switch");
		 
	 }
	 
	 public void viewdet()
	 {
		 viewdetails.click();
	 }
	 
	 public void myskempinfo() throws InterruptedException
	 {
		Thread.sleep(2000);
		 empinfo1.click();
	
	 }
	 
	 
	 public void myskillmenuuuu() throws Throwable 
	 {
		myskillss123.click();
		
		
	 }
	 
	 public void myskillsdeatils() throws InterruptedException
	 {
		 Thread.sleep(3000);
		driver.switchTo().frame(frame1);
	 System.out.println("frame switch");
		searchby.click();
	 }
	 
	 public void searchdrop(String strsearch, String strserfor) throws InterruptedException
	 {
		 //Thread.sleep(2000);
		 
		
		// searchby.click();
		 Select search = new Select(searchby);
		 search.selectByVisibleText(strsearch);
		 
		 searchfor.click();
		 Select serfor = new Select(searchfor);
		 serfor.selectByVisibleText(strserfor);
		 
		 searchbutton.click();
		  
		 
	 }
	
	 public void approved(String strserapp, String strserforapp) throws InterruptedException
	 {
		 Thread.sleep(2000);
		 Select search = new Select(searchby);
		 search.selectByVisibleText(strserapp);
		 
		 searchfor.click();
		 Select serfor = new Select(searchfor);
		 serfor.selectByVisibleText(strserforapp);
		  
		 searchbutton.click();
	 }

	 public void reject(String strserrej, String strserforrej) throws InterruptedException
	 {
		 Thread.sleep(2000);
		 Select search = new Select(searchby);
		 search.selectByVisibleText(strserrej);
		 
		 searchfor.click();
		 Select serfor = new Select(searchfor);
		 serfor.selectByVisibleText(strserforrej);
		  
		 searchbutton.click();
	 }
	 


	 
	 public void homeclickkkk() throws InterruptedException
	 {
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement home2 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[@id='home']"));
		home2.click();
	 }
	 
	/* public void leavedetaclick() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.switchTo().frame(frame1);
		 timesheets.click();
		
		
	 } */
	 
	 
}
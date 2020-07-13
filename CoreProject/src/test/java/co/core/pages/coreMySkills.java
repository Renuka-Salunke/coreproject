package co.core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class coreMySkills {
	
	WebDriver driver;
	
	 public coreMySkills(WebDriver driver)
	{
		this.driver = driver;
	}
	 
	
	 //empinfo
	 @FindBy(how=How.XPATH, using="//span[contains(text(),'Employee info')]") WebElement empinfo1;
	 
	 //my skills 
	 @FindBy(how=How.XPATH, using=" //a[contains(text(),'My Skills')]") WebElement myskills;
	 
	 
	//personal info with frame 
		 @FindBy(how=How.XPATH, using="//iframe[@id='rightMenu']") WebElement frame3;
		 
	 
	 //search by drop
	 @FindBy(how=How.XPATH, using="//select[@id='loc_codeNew']") WebElement searchby;
	 
	 //search for
	 @FindBy(how=How.XPATH, using="//select[@id='cmbSkillStatus']") WebElement searchfor;
	 
	 //search button
	 @FindBy(how=How.XPATH, using="//button[contains(text(),'Search')]") WebElement searchbutton;
	 
	 
	 @FindBy(how=How.XPATH, using="//span[contains(text(),'home')]") WebElement homee;
	 
	 public void myskempinfo() throws InterruptedException
	 {
		// driver.switchTo().frame(frame3);
		 empinfo1.click();
		
	//	 Thread.sleep(2000);
		 //empinfo1.click();
	 }
	 
	 public void myskillmenu()
	 {
		 
		 myskills.click();
	 }
	 
	 public void myskillsdeatils() throws InterruptedException
	 {
		 Thread.sleep(3000);
		driver.switchTo().frame(frame3);
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
	 
	 public void home() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 homee.click();
	 } 
	
}

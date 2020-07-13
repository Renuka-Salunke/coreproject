package co.core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class coreDocument {
	WebDriver driver;
	public coreDocument(WebDriver driver)
	{
		this.driver = driver;
	}

	//Employee details
	 @FindBy(how=How.XPATH, using="//span[contains(text(),'Employment Details')]") WebElement empdetails;
	 
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Document')]") WebElement documentmenu;
	 
	 @FindBy(how=How.XPATH, using="//select[@id='cmbProcessCode']") WebElement hrprocess;
	 
	 @FindBy(how=How.XPATH, using="//select[@id='cmbDocCode']") WebElement documents;
	 
	 @FindBy(how=How.XPATH, using="//input[@id='radiotoSubmittedDocStatus']") WebElement upload;
	 
	 //date picker submission date
	 @FindBy(how=How.XPATH, using="//button[@id='btnSubmissionDocdate']") WebElement document;
	 
	 @FindBy(how=How.XPATH, using="//div[21]//div[1]//tr[1]//th[2]") WebElement docyear;
	 
	 @FindBy(how=How.XPATH, using="//div[21]//div[1]//tr[1]//th[1]") WebElement docarrow;
			 
	 @FindBy(how=How.XPATH, using="//div[21]//tr//td[contains(text(),'30')]") WebElement docdate;
	 
	 public void employeedetails()
	 {
		 empdetails.click();
	 }
	 
	 public void docmenuemp() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 documentmenu.click();
	 }
	 
	 public void hrprocessmenu(String strhr,String strdoc)
	 {
		 hrprocess.click();
		 
		 Select hr = new Select(hrprocess);
		 hr.selectByVisibleText(strhr);
		 
		 documents.click();
		 Select doc = new Select(documents);
		 doc.selectByVisibleText(strdoc);
	 }
	 
	 public void uploadstatus()
	 {
		 upload.click();
	 }
	 
	 public void submissiondatedatepicker()
	 {
		 document.click();
		 
		 String monthdoc = "August 2019";
		 
		 while(true)
		 {
			 String text5 = docyear.getText();
					 
			if(text5.equals(monthdoc))
			{
				break;
			}
			else
			{
				docarrow.click();
			}
		 }
		 
		 docdate.click();
	 }
	 
}

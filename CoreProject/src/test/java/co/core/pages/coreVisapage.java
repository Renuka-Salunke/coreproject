package co.core.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class coreVisapage {

	WebDriver driver;
	public coreVisapage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Employee details
		 @FindBy(how=How.XPATH, using="//span[contains(text(),'Employment Details')]") WebElement empdetails;
		 
		 //visa menu option
		 @FindBy(how=How.XPATH, using="//a[contains(text(),'Visa')]") WebElement visamenu;
		 
		 //visa type
		 @FindBy(how=How.XPATH, using="//select[@id='txtVSNo']") WebElement type;
		 
		 //ISSUE DATE PICKER
		 @FindBy(how=How.XPATH, using="//div[@id='addPaneVisa']//div[2]//div[1]//div[1]//span[1]//button[1]//i[1]") WebElement issuevisa;
		 
		 //year
		 @FindBy(how=How.XPATH, using="//div[23]//div[1]//tr[1]//th[2]") WebElement yearissue;
		 
		 //issue arrow
		 @FindBy(how=How.XPATH, using="//div[23]//div[1]//tr[1]//th[1]") WebElement arrowissue;
		 
		 //date
		 @FindBy(how=How.XPATH, using="//div[23]//tr//td[contains(text(),'10')]") WebElement dateissue;
		  
		 //issued place
		 @FindBy(how=How.XPATH, using="//select[@id='txtVIssuPlace']") WebElement issueplacevisa;
		 
		 //Date of expiry date picker
		 @FindBy(how=How.XPATH, using="//div[@id='visa']//div[4]//div[1]//div[1]//span[1]//button[1]//i[1]") WebElement dateofexppick;
				 
		//year expiry		 
		 @FindBy(how=How.XPATH, using="//div[24]//div[1]//tr[1]//th[2]") WebElement yearexp;
			
		 //arrow expiry
		 @FindBy(how=How.XPATH, using="//div[24]//div[1]//tr[1]//th[3]") WebElement arrowexp;
		
		 //date expiry
		 @FindBy(how=How.XPATH, using="//div[24]//tr//td[contains(text(),'15')]") WebElement dateexp;
		 
		 //I-94 Expiry Date picker
		 @FindBy(how=How.XPATH, using="//div[@id='visa']//div[5]//div[1]//div[1]//span[1]//button[1]//i[1]") WebElement I94datepicker;
		 
		 //year
		 @FindBy(how=How.XPATH, using="//div[25]//div[1]//tr[1]//th[2]") WebElement I94year;
		 
		 //arrow
		 @FindBy(how=How.XPATH, using="//div[25]//div[1]//tr[1]//th[3]") WebElement I94arrow;
		 
		 //date
		 @FindBy(how=How.XPATH, using="//div[25]//tr//td[contains(text(),'24')]") WebElement I94date;
		 
		 //Reset 
		 @FindBy(how=How.XPATH, using="//div[@id='addPaneVisa']//button[contains(@class,'btn btn-primary')][contains(text(),'Reset')]") WebElement visareset;
		 
		/* public void employeedetails()
		 {
			 empdetails.click();
		 } */
		 
		 public void visamenuemp() throws InterruptedException
		 {
			 Thread.sleep(2000);
			 visamenu.click();
		 }
		 
		 public void visatype(String strtype)
		 {
			 type.click();
			 Select  typee = new Select(type);
			 typee.selectByValue(strtype);
		 }
		 
		 public void issuevisadatepicker() throws InterruptedException
		 {
			 issuevisa.click();
			 
			 Thread.sleep(2000);
			 
			 String issuemonth = "June 2019";
			 
			 while(true)
				 {
				   String text3 = yearissue.getText();
				   
				   if(text3.equals(issuemonth))
				   {
					   break;
				   }
				   else
				   {
					   arrowissue.click();
				   }
				 }
			 dateissue.click();
		 }
		 
		 public void issuedplace(String strplace)
		 {
			 issueplacevisa.click();
			 Select place = new Select(issueplacevisa);
			 place.selectByValue(strplace);
		 }
		 
		 
		 public void dateofexpvisa() throws InterruptedException
		 {
			 dateofexppick.click();
			 
			 Thread.sleep(2000);
			 String expmonth = "January 2021";
			 
			 while(true)
			 {
				 String text4 = yearexp.getText();
				 if(text4.equals(expmonth))
				 {
					 break;
				 }
				 else
				 {
					arrowexp.click();
				 }
			 }
			 
			 dateexp.click();
		 }
		 
		 
		 public void I94pvisa() throws InterruptedException
		 {
			 JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,73)");
				
			 I94datepicker.click();
			 
			 Thread.sleep(2000);
			 String expmonth = "March 2022";
			 
			 while(true)
			 {
				 String text4 = I94year.getText();
				 if(text4.equals(expmonth))
				 {
					 break;
				 }
				 else
				 {
					 I94arrow.click();
				 }
			 }
			 
			 I94date.click();
		 }
		 
		 
		 public void visareset()
		 {
			 visareset.click();
		 }
}

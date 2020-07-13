package co.core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class corepassport {
	 WebDriver driver;
		
	 public corepassport(WebDriver driver)
	{
		this.driver = driver;
	}
	 
//personal info with frame 
	// @FindBy(how=How.XPATH, using="//iframe[@id='rightMenu']") WebElement frame;
	 
	 //personal details
	// @FindBy(how=How.XPATH, using="//span[contains(text(),'Personal Details')]") WebElement personalinfo;
	 
	 //passport
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Passport')]") WebElement passport;
	 
	 //passport number
	 @FindBy(how=How.XPATH,using="//input[@id=\"txtPPNo\"]") WebElement passportnumber;
	 
	 //issued date of date picker
	 @FindBy(how=How.XPATH,using="//div[@id='addPaneImmigration']//div[2]//div[1]//div[1]//span[1]//button[1]//i[1]") WebElement issuedate;
	 
	 //issued year
	 @FindBy(how=How.XPATH,using="//div[12]//div[1]//tr[1]//th[2]") WebElement issyear;
	 
	 //issuedate arrow
	 @FindBy(how=How.XPATH,using="//div[12]//div[1]//tr[1]//th[1]") WebElement isspreviousarrow;
	 
	 //issue date
	 @FindBy(how=How.XPATH,using="//div[12]//tr//td[contains(text(),'13')]") WebElement issdate;
	
	 //Issued place
	 @FindBy(how=How.XPATH,using="//input[@id=\"txtIssuPlace\"]") WebElement issuedplace;
	 
	 //Date of Expiry date picker
	 @FindBy(how=How.XPATH,using="//div[@id='passport']//div[4]//div[1]//div[1]//span[1]//button[1]//i[1]") WebElement Dateexpiry;
	
	 //DOE year
	 @FindBy(how=How.XPATH,using="//div[13]//div[1]//tr[1]//th[2]") WebElement Doeyear;
	 
	 //DOE arrow
	 @FindBy(how=How.XPATH,using="//div[13]//div[1]//tr[1]//th[3]") WebElement Doearrow;
	 
	 //DOE date
	 @FindBy(how=How.XPATH,using="//div[13]//tr//td[contains(text(),'12')]") WebElement Doedate;
	 
	 //Passport save button
	 @FindBy(how=How.XPATH,using="//div[@id='addPaneImmigration']//button[@id='btnAddPassport']") WebElement saveButton;
	 
	 //passport reset button
	 @FindBy(how=How.XPATH,using="//div[@id='addPaneImmigration']//button[contains(@class,'btn btn-primary')][contains(text(),'Reset')]") WebElement resetbutton;
	
	 
	/* public void personaldetails() throws InterruptedException
	 {
		 Thread.sleep(3000);
		driver.switchTo().frame(frame);
		 System.out.println("frame switch");
		 personalinfo.click();
	 }*/
	 
	 
	 public void passport()
	 {
		passport.click(); 
	 }
	 
	 public void passnumber(String strpass)
	 {
		 passportnumber.sendKeys(strpass);
	 }
	 
	 public void issueddatepicker()
	 {
		 issuedate.click();
	 }
	 
	 public void issuedmonthyear()
	 {
		 String monthissue = "April 2017";
		// String day = "12";
		 
		 while(true)
		 {
			 String text1 = issyear.getText();
	
			 if(text1.equals(monthissue))
			 {
				 break;
			 }
			 
			 else
			 {
				 isspreviousarrow.click();
			 }
		 }
		 
		//issued date click 
		issdate.click();
	 }
	
	 
	 public void issuedplace(String strplace)
	 {
		 issuedplace.sendKeys(strplace);
	 }
	 
	 public void dateexpire()
	 {
		 Dateexpiry.click();
	 }
	
	 public void DOEyearselect()
	 {
		 String month1 = "April 2027";
		// String day = "12";
		 	 
		 while(true)
		 {
			 String text = Doeyear.getText();
	
			 if(text.equals(month1))
			 {
				 break;
			 }
			 
			 else
			 {
				 Doearrow.click();
			 }
		 }
		 
		//DOE date click 
		 Doedate.click();
	 }

	 
	 public void savepassport()
	 {
		 saveButton.click();
	 }
	 
	 public void resetpassport() throws InterruptedException
	 {
		 Thread.sleep(2000);
		resetbutton.click();;
	 }
	
}

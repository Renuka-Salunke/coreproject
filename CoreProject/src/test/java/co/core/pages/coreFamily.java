package co.core.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class coreFamily {

	WebDriver driver;
	
	 public coreFamily(WebDriver driver)
	{
		this.driver = driver;
	}
	 
	 //Family menu
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Family')]") WebElement family;
	 
	 //family name
	 @FindBy(how=How.XPATH, using="//input[@id='txtDepName']") WebElement familyname;
	 
	 //relation drop
	 @FindBy(how=How.XPATH, using="//select[@id='cmbRelationship']") WebElement relationdrop;
	 
	/* //date of birth date picker
	 @FindBy(how=How.XPATH, using="//div[@id='addPaneDependents']//i[@class='fa fa-calendar']") WebElement dobpicker;
	 
	 //age year
	 @FindBy(how=How.XPATH, using="//body[@class='sticky-header']/div[9]/div[3]/table[1]/thead[1]/tr[1]/th[2]") WebElement dateyear;
	 
	 //age arrow
	 @FindBy(how=How.XPATH, using="//body[@class='sticky-header']/div[9]/div[3]/table[1]/thead[1]/tr[1]/th[1]") WebElement agearrow;
	 
	 //age date
	 @FindBy(how=How.XPATH, using="//div[9]//tr//td[contains(text(),'12')]") WebElement agedate;*/
	 
	 //date picker
	 @FindBy(how=How.XPATH, using="//div[@id='addPaneDependents'] //i[@class='fa fa-calendar']")  WebElement Calenderclick;
	 @FindBy(how=How.XPATH, using="//body[@class='sticky-header']/div[9]/div[3]/table[1]/thead[1]/tr[1]/th[1]") WebElement calenderscrollback;
	 @FindBy(how=How.XPATH, using="//span[contains(text(),'1981')]") WebElement selectcalenderyear;
	 @FindBy(how=How.XPATH, using=" //div[9]//div[2]//span[5]") WebElement selectcalendermonth;
	 @FindBy(how=How.XPATH, using="//div[9]//tr[6]//td[1]") WebElement selectcalenderdate;
	 
	 //radio button
	 @FindBy(how=How.XPATH, using="//input[@id='depGender1']") WebElement gender;
	 
	 //check box
	 @FindBy(how=How.XPATH, using="//input[@id='dependentcheckbox']") WebElement depcheck;
	 
	 //reset family
	 @FindBy(how=How.XPATH, using="//div[@id='addPaneDependents']//button[@class='btn btn-primary'][contains(text(),'Reset')]") WebElement resetfamily;
	 
	 public void familymenu()
	 {
		 family.click();
	 }
	 
	 public void familycorename(String famname)
	 {
		 familyname.sendKeys(famname);
	 }
	 
	 public void relationshipdrop(String strrela)
	 {
		 relationdrop.click();
		 Select rel = new Select(relationdrop);
		 rel.selectByValue(strrela);
	 }
	 
	
	 
	/* public void ageyearmonth()
	 {
		 String monthage = "May 1981";
		// String day = "12";
		 
		 while(true)
		 {
			 String text2 =  dateyear.getText();
	
			 if(text2.equals(monthage))
			 {
				 break;
			 }
			 
			 else
			 {
				 agearrow.click();
			 }
		 }
		 
		//issued date click 
		agedate.click();
	 }*/
	 
	 
	public void SelectDOB()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,73)");
			Calenderclick.click();
			for(int i=1; i<=4; i++) 
			{
				calenderscrollback.click();	
			}
			selectcalenderyear.click();
			
			selectcalendermonth.click();
			selectcalenderdate.click();
		}
	
	public void gender()
	{
		gender.click();
	}
	
	public void dependant()
	{
		depcheck.click();
	}
	
	public void resetfambtn()
	{
		resetfamily.click();
	}
}

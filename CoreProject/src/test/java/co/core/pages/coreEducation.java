package co.core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class coreEducation {

	  WebDriver driver;
		
		 public coreEducation(WebDriver driver)
		{
			this.driver = driver;
		}
		 
		 //eduaction dropdown
		 @FindBy(how=How.XPATH, using="//a[contains(text(),'Education')]") WebElement education;
		 
		 //qaulification dropdown
		 @FindBy(how=How.XPATH, using=" //select[@id='cmbEduCode']") WebElement qualification;
		 
		 //course dropdown
		 @FindBy(how=How.XPATH, using="//*[@name='txtCourse']") WebElement course;

		 //Result dropdown
		 @FindBy(how=How.XPATH, using="//*[@name='cmbResult']") WebElement result;
		 
		 //Year of passing dropdown
		 @FindBy(how=How.XPATH, using="//*[@name='txtEmpEduYearpassing']") WebElement yearofpass;
		 
		 
		 //Education save button
		 @FindBy(how=How.XPATH, using="//*[@name='btnAddEducation']") WebElement savebtneducation;
		 
		 //Education reset button
		 @FindBy(how=How.XPATH, using="//div[@id='addPaneEducation']//button[contains(@class,'btn btn-primary')][contains(text(),'Reset')]") WebElement resetbtn;
		 
		 
        public void edumenu()
        {
        	education.click();
        }
        
        public void qualificationdrop(String strQal) throws InterruptedException
        {
        	qualification.click();
        	
        	Select qua = new Select(qualification);
        	qua.selectByValue(strQal);	   	
        }
        
        public void coursedrop(String strcor1)
        {
        	course.click();
        	
        	Select cor = new Select(course);
        	cor.selectByVisibleText(strcor1);
        }
        
        public void result(String strRes)
        {
        	result.click();
        	Select res = new Select(result);
        	res.selectByValue(strRes);
        	
        }
        
        public void yearpass(String year)
        {
        	yearofpass.click();
        	Select yop = new Select(yearofpass);
        	yop.selectByVisibleText(year);
        }
        
        public void savebtn()
        {
        	 savebtneducation.click();
        }
        
        public void resbtn() throws InterruptedException
        {
        	Thread.sleep(2000);
        	 resetbtn.click();
        }
}
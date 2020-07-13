package co.core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class corecontact {
   
	WebDriver driver;
	
	 public corecontact(WebDriver driver)
	{
		this.driver = driver;
	}
	 
	//personal info with frame 
		 @FindBy(how=How.XPATH, using="//iframe[@id='rightMenu']") WebElement frame;
		 
		 //personal details
		 @FindBy(how=How.XPATH, using="//span[contains(text(),'Personal Details')]") WebElement personalinfo;
		 
	
	
	 @FindBy(how=How.XPATH, using="/html[1]/body[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]") WebElement Contactmenu;
	 
	 @FindBy(how=How.XPATH, using="//select[@id='countrycodeCur']") WebElement countrydrop;
	@FindBy(how=How.XPATH, using="//select[@id='txtStateCur']") WebElement state;
	 @FindBy(how=How.XPATH, using="//select[@id='cmbCityCur']") WebElement city;
	 
	//@FindBy(how=How.XPATH, using="//button[@id='btnClearContact']") WebElement resetbutton;
	 
	 public void personaldetails() throws InterruptedException
	 {
		 Thread.sleep(3000);
		driver.switchTo().frame(frame);
		 System.out.println("frame switch");
		 personalinfo.click();
	 }
	 
	 public void contactmenuu()
	 {
		 Contactmenu.click();
	 }
	 
	 public void alldropdown(String strcon, String strste, String strct)
	 {
		 countrydrop.click();
     	Select cont = new Select(countrydrop);
     	cont.selectByVisibleText(strcon);
     	
     	
     	state.click();
    	Select st = new Select(state);
    	st.selectByVisibleText(strste);
    	
    	
    	city.click();	
    	Select cor = new Select(city);
    	cor.selectByVisibleText(strct);
		 
	 }
         
	
}

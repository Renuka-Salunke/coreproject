package co.core.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class coreEmpInfopage {
	   WebDriver driver;
	
	 public coreEmpInfopage(WebDriver driver)
	{
		this.driver = driver;
	}
	 
	
	 @FindBy(how=How.XPATH, using="//span[contains(text(),'Employee info')]") WebElement employeeinfo;
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'My info')]") WebElement myinfo;
	//my skills 
	//	 @FindBy(how=How.XPATH, using="//a[contains(text(),'My Skills')]") WebElement myskillss123;
		 
		//homeclick
		// @FindBy(how=How.XPATH, using="//span[contains(text(),'home')]") WebElement homeclick;
		 
	 
	 public void empinfo()
	 {
		 employeeinfo.click();
	 }

	
	
	 
	 public void myinfo() 
		{
		
		   myinfo.click();
		
		}
	 
}

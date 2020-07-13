package co.core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class corecurrentlocation {

	WebDriver driver;
	public corecurrentlocation(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Current Location')]")  WebElement currentlocmenu;
	@FindBy(how=How.XPATH, using="//select[@id='currentLocation']") WebElement locationdropdown;
	@FindBy(how=How.XPATH, using="//textarea[@id='txtCurrentAddress']") WebElement address;
	@FindBy(how=How.XPATH, using="//div[@id='empCurrentLocation']//button[@class='btn btn-primary'][contains(text(),'Reset')]") WebElement currreset;
	@FindBy(how=How.XPATH, using="//button[@class='btn btn-primary pull-right']") WebElement backprofile;
	 
		//homeclick
		 @FindBy(how=How.XPATH, using=" //span[contains(text(),'home')]") WebElement homeclickkk;
		 
	
	public void currentmenu()
	{
		currentlocmenu.click();
	}
	
	public void currentlocdrop(String strcurdrop) throws InterruptedException
	{
		Thread.sleep(2000);
		locationdropdown.click();
		Select curdrop = new Select(locationdropdown);
		curdrop.selectByVisibleText(strcurdrop);
		
	}
	
	public void locaddress(String add)
	{
		address.sendKeys(add);
	}
	
	public void resetloc()
	{
		currreset.click();
	}
	
	public  void backprof()
	{
		backprofile.click();
	}
	
	
	 
	public void homeafterlocclick() throws InterruptedException 
	 {
		 Thread.sleep(2000);
		 homeclickkk.click();
	 } 
}

package co.core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Coreloginpage {

	WebDriver driver;
	public Coreloginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//using findby for locating elements
	@FindBy(how=How.XPATH, using="//input[@name='txtUserName']") WebElement emailTextBox;
	@FindBy(how=How.XPATH, using="//input[@name='txtPassword']") WebElement passwordTextBox;
	@FindBy(how=How.XPATH, using="//button[@class='btn btn-lg btn-login btn-block']") WebElement signinButton;
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Logout')]") WebElement logoutbutton;

	//defining all the user actions that can be performed in the fB homepage

	//this method used to set email in the email textbox
	
	public void setEmail(String strEmail)
	{
		emailTextBox.sendKeys(strEmail);
	}
	
	public void setPassword(String strPass)
	{
		passwordTextBox.sendKeys(strPass);
	}
	
	public void clickonloginButton()
	{
		signinButton.click();
	}
	
	public void clickonlogout()
	{
	//	logoutbutton.click();
		
	}
}

package co.core.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class coreSkills {

	 WebDriver driver;
	
	 public coreSkills(WebDriver driver)
	{
		this.driver = driver;
	}
	 //skill menu
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Skills')]") WebElement skillsmenu;
	 //primary skills
	 @FindBy(how=How.XPATH, using="//select[@id='cmbPrimMainSkilCode']") WebElement primaryskill;
	 @FindBy(how=How.XPATH, using="//select[@id='cmbSubSkilCode']") WebElement subskill;
	 @FindBy(how=How.XPATH, using="//select[@id='cmbPrimSkillLabel']") WebElement skilllevel;
	 @FindBy(how=How.XPATH, using="//select[@id='txtEmpPrimYears']") WebElement experienceyear;
	 @FindBy(how=How.XPATH, using="//select[@id='txtEmpPrimMonth']") WebElement experiencemonth;
	 
	 //SECONDARY SKILL
	 @FindBy(how=How.XPATH, using="//select[@id='cmbSecSkilCode']") WebElement secondaryskill;
	 @FindBy(how=How.XPATH, using="//select[@id='cmbSecSubSkilCode']") WebElement secskill;
	 @FindBy(how=How.XPATH, using="//select[@id='cmbSecSkillLabel']") WebElement secskilllev;
	 @FindBy(how=How.XPATH, using="//select[@id='txtEmpSecYears']") WebElement secexpyear;
	 @FindBy(how=How.XPATH, using="//select[@id='txtEmpSecMonth']") WebElement secexpmon;
	 
	 //other skill
	 @FindBy(how=How.XPATH, using="//select[@id='cmbOthSkilCode']") WebElement otherskill;
	 @FindBy(how=How.XPATH, using="//select[@id='cmbOthSubSkilCode']") WebElement othersubskill;
	 @FindBy(how=How.XPATH, using="//select[@id='cmbOthSkillLabel']") WebElement otherskilllevel;
	 @FindBy(how=How.XPATH, using="//select[@id='txtEmpOthYears']") WebElement otherexpyear;
	 @FindBy(how=How.XPATH, using="//select[@id='txtEmpOthMonth']") WebElement otherexpmonth;
	 
	 //reset
	 @FindBy(how=How.XPATH, using="//div[@id='addPaneSkills']//button[@class='btn btn-primary'][contains(text(),'Reset')]") WebElement resetskills;
	 
	 public void skillmenuu()
	 {
		 skillsmenu.click();
	 }
	 public void primaryskills(String strpriskill, String strsubskill, String strskilllev,String strexpyear, String strexpmonth) throws InterruptedException
	 {
		 Thread.sleep(2000);
		 primaryskill.click();
	     	Select prisk = new Select(primaryskill);
	     	prisk.selectByVisibleText(strpriskill);
	     	
	     	
	     	subskill.click();
	    	Select subsk = new Select(subskill);
	    	subsk.selectByVisibleText(strsubskill);
	    	
	    	
	    	skilllevel.click();	
	    	Select sklev = new Select(skilllevel);
	    	sklev.selectByVisibleText(strskilllev);
	    	
	    	experienceyear.click();	
	    	Select exye = new Select(experienceyear);
	    	exye.selectByVisibleText(strexpyear);
	    	
	    	experiencemonth.click();	
	    	Select exmon = new Select(experiencemonth);
	    	exmon.selectByVisibleText(strexpmonth);
	 }
	 
	 
	 
	 public void secondaryskills(String strsecskill, String strsecskills, String strsecskilllev,String strsecexpyear, String strsecexpmonth) throws InterruptedException
	 {
		// Thread.sleep(2000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,73)");
		 secondaryskill.click();
	     	Select secsk = new Select(secondaryskill);
	     	secsk.selectByVisibleText(strsecskill);
	     	
	     	JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("window.scrollBy(0,73)");
			
	     	secskill.click();
	    	Select secsubsk = new Select(secskill);
	    	secsubsk .selectByVisibleText(strsecskills);
	    	
	    	JavascriptExecutor js2=(JavascriptExecutor)driver;
			js2.executeScript("window.scrollBy(0,73)");
	    	
	    	secskilllev.click();	
	    	Select secsklev = new Select(secskilllev);
	    	secsklev.selectByVisibleText(strsecskilllev);
	    	
	    	JavascriptExecutor js3=(JavascriptExecutor)driver;
			js3.executeScript("window.scrollBy(0,73)");
	    	
	    	secexpyear.click();	
	    	Select secexye = new Select(secexpyear);
	    	secexye.selectByVisibleText(strsecexpyear);
	    	
	    	secexpmon.click();	
	    	Select secexmon = new Select(secexpmon);
	    	secexmon.selectByVisibleText(strsecexpmonth);
	 }
	 
	 public void otherskills(String strotherskill, String strothersubskills, String strotherskilllev,String strotherexpyear, String strotherexpmonth) throws InterruptedException
	 {
		
		// Thread.sleep(2000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,73)");
			
		 otherskill.click();
	     	Select othersk = new Select(otherskill);
	     	othersk.selectByVisibleText(strotherskill);
	     	
	     	JavascriptExecutor js4=(JavascriptExecutor)driver;
			js4.executeScript("window.scrollBy(0,73)");
			
	     	othersubskill.click();
	    	Select othersubsk = new Select(othersubskill);
	    	othersubsk.selectByVisibleText(strothersubskills);
	    	
	    	
	    	otherskilllevel.click();	
	    	Select othersklev = new Select(otherskilllevel);
	    	othersklev.selectByVisibleText(strotherskilllev);
	    	
	    	JavascriptExecutor js5=(JavascriptExecutor)driver;
			js5.executeScript("window.scrollBy(0,73)");
	    
	    	otherexpyear.click();	
	    	Select otherexye = new Select(otherexpyear);
	    	otherexye.selectByVisibleText(strotherexpyear);
	    	
	    	otherexpmonth.click();	
	    	Select otherexmon = new Select(otherexpmonth);
	    	otherexmon.selectByVisibleText(strotherexpmonth);
	 }
	 

    public void resetskils()
    {

 
    	JavascriptExecutor js6=(JavascriptExecutor)driver;
		js6.executeScript("window.scrollBy(0,73)");
    
			resetskills.click();
    }
	 
}

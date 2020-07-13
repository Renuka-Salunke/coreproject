package co.core.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CoreCertifications {

	 WebDriver driver;
		
	 public CoreCertifications(WebDriver driver)
	{
		this.driver = driver;
	}
	 
	 
	 //Employee details
//	 @FindBy(how=How.XPATH, using="//span[contains(text(),'Employment Details')]") WebElement empdetails;
	 
	 //Certifications menu
	 @FindBy(how=How.XPATH, using="//a[contains(text(),'Certifications')]") WebElement certification;
	 
	 //ceritification dropdown
	 @FindBy(how=How.XPATH, using="//select[@name='cmbCertCode']") WebElement certidrop;
	 
	 //Date picker calender
	 @FindBy(how=How.XPATH, using="//div[@id='addPaneCertifications']//i[@class='fa fa-calendar']") WebElement Datepickercerti;
	 
	 //Certificate year
	 @FindBy(how=How.XPATH, using="//body[@class='sticky-header']/div[14]/div[1]/table[1]/thead[1]/tr[1]/th[2]") WebElement CertificateYear;
	 
	 //certificate year arrow
	 @FindBy(how=How.XPATH, using="//body[@class='sticky-header']/div[14]/div[1]/table[1]/thead[1]/tr[1]/th[1]") WebElement CertificateArrow;
	 
	 //Certificate date
	 @FindBy(how=How.XPATH, using="//div[14]//tr//td[contains(text(),'24')]") WebElement CertificateDate;
	 
	 //Certificate comments
	 @FindBy(how=How.XPATH, using="//textarea[@name='txtEmpCComments']") WebElement CertificateComments;
	 
	 //certificate save
	 @FindBy(how=How.XPATH, using="//div[@id='addPaneCertifications']//button[@id='btnAddSkill']") WebElement certiSave;
	 
	 //certificate Reset
	 @FindBy(how=How.XPATH, using="//div[@id='addPaneCertifications']//button[@class='btn btn-primary'][contains(text(),'Reset')]") WebElement certiReset;
	
	
	 public void certific() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 certification.click();
	 }
	 
	 public void certidropdown(String strcer)
	 {
		certidrop.click();
		Select cer = new Select(certidrop);
		cer.selectByValue(strcer);
	 }
	 
	 public void certificatedatepicker()
	 {
		 Datepickercerti.click();
	 }
	 
	 public void certificateyearselect()
	 {
		 
		 String monthcer = "May 2013";
		 
		 while(true)
		 {
			 String text2 = CertificateYear.getText();
					 
			if(text2.equals(monthcer))
			{
				break;
			}
			else
			{
				CertificateArrow.click();
			}
		 }
		 
		 //cerificate date
		 CertificateDate.click();
	 }
	 
	 public void certificatecomments(String strcomment)
	 {
		 CertificateComments.sendKeys(strcomment);
	 }
	 
	 public void certsaveBtn()
	 {
		 certiSave.click();
	 }
	 
	 public void certResetBtn()
	 {
		 certiReset.click();
	 }
	 
	 
}

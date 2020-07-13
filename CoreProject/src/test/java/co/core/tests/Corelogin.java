package co.core.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import co.core.pages.CoreCertifications;
import co.core.pages.Coreloginpage;
import co.core.pages.coreDocument;
import co.core.pages.coreEducation;
import co.core.pages.corecontact;
import co.core.pages.corecurrentlocation;
import co.core.pages.coreEmpInfopage;
import co.core.pages.coreFamily;
import co.core.pages.corepassport;
import co.core.pages.coreViewDetailpages;
import co.core.pages.coreMySkills;
import co.core.pages.coreSkills;
import co.core.pages.coreVisapage;

public class Corelogin extends TestBase{
	
	@Test(priority=1)
	public void init() throws InterruptedException
	{
		Coreloginpage loginpage = PageFactory.initElements(driver, Coreloginpage.class);
		loginpage.setEmail("renuka.salunke");
		loginpage.setPassword("N>Bd+!s3@");
		loginpage.clickonloginButton();
		loginpage.clickonlogout();
		
	}
	
	@Test(priority=2)
	public void viewcoredet() throws Throwable
	{
		coreViewDetailpages viewdetail = PageFactory.initElements(driver, coreViewDetailpages.class);
		viewdetail.frameview();
		viewdetail.viewdet();
		
		Thread.sleep(3000);
		viewdetail.myskempinfo();
		
		Thread.sleep(4000);
		viewdetail.myskillmenuuuu();
		
	/* Thread.sleep(2000);
	   viewdetail.myskillsdeatils();
	    viewdetail.searchdrop("Status", "Pending Approval");
	    viewdetail.approved("Status", "Approved"); 
		   viewdetail.reject("Status", "Reject"); */
		
		   
		Thread.sleep(3000);
		
		viewdetail.homeclickkkk();
		
	    
	}
	
	@Test(priority=3)
	public void home() throws Throwable 
	{
		coreEmpInfopage homepage = PageFactory.initElements(driver, coreEmpInfopage.class);
		Thread.sleep(3000);
	    homepage.empinfo();
	
		Thread.sleep(3000);
		homepage.myinfo();
	}
	
	@Test(priority=4)
	public void corecont() throws InterruptedException
	{
		
	corecontact contct = PageFactory.initElements(driver, corecontact.class);
	contct.personaldetails();
	contct.contactmenuu();
	contct.alldropdown("Canada", "Ontario", "Mississauga");
      
	
}
	@Test(priority=5)
	public void familycoremenu()
	{
		coreFamily familyyy = PageFactory.initElements(driver, coreFamily.class);
	    familyyy.familymenu();
		familyyy.familycorename("Rohit Salunke");
		familyyy.relationshipdrop("009");
		familyyy.SelectDOB();
		familyyy.gender();
		familyyy.dependant();
		familyyy.resetfambtn();
	}
	
	@Test(priority=6)
	public void passportdetail() throws InterruptedException
	{
		corepassport details = PageFactory.initElements(driver, corepassport.class);
		//personal details menu option
	//details.personaldetails();
		
		//passport menu option
	   details.passport();
		
		//Passport number
		details.passnumber("P9455374");
		
		//Passport issued date picker
		details.issueddatepicker();
		
		//Passport issued month n year
    details.issuedmonthyear();
		
		//passport issued place
	details.issuedplace("Pune");
	
	//passport date expiry date picker
	details.dateexpire();
	
	//passport date of expiry year n month
	details.DOEyearselect();
	
	//Save button
	//details.savepassport();
	
	//Reset button
		details.resetpassport();
	}  
	
	@Test(priority=7)
	public void education() throws InterruptedException 
	{
		coreEducation educationpage = PageFactory.initElements(driver, coreEducation.class);
		//education menu option
    educationpage.edumenu();
		
		//education dropdown
       educationpage.qualificationdrop("18");
        
        //course dropdown
        educationpage.coursedrop("Graduation");
        
      //result dropdown
        educationpage.result("Distinction");
        
        //year of passing dropdown
        educationpage.yearpass("2011");
        
        //save button
     //   educationpage.savebtn();
        
        //reset button
        educationpage.resbtn();
        
	}
	
	@Test(priority=8)
	public void document() throws InterruptedException
	{
		coreDocument documentdetails = PageFactory.initElements(driver, coreDocument.class);
		documentdetails.employeedetails();
		documentdetails.docmenuemp();
		documentdetails.hrprocessmenu("Recruitment", "Form 16");
		documentdetails.uploadstatus();
		documentdetails.submissiondatedatepicker();
	}
	
	@Test(priority=9)
	public void visa() throws InterruptedException
	{
		coreVisapage visadetails = PageFactory.initElements(driver, coreVisapage.class);
		//visadetails.employeedetails();
		visadetails.visamenuemp();
		visadetails.visatype("H1");
		visadetails.issuevisadatepicker();
		visadetails.issuedplace("017");
		visadetails.dateofexpvisa();
		visadetails.I94pvisa();
		visadetails.visareset();
	
	}
	

	@Test(priority=10)
	public void skills() throws InterruptedException
	{
		coreSkills skillsdetails = PageFactory.initElements(driver, coreSkills.class);
		
		skillsdetails.skillmenuu();
		skillsdetails.primaryskills("ATM Switch", "Implementation", "5", "5", "3");
		skillsdetails.secondaryskills("Database", "Postgress", "3", "6", "9");
		skillsdetails.otherskills("Devops", "Jira", "4", "1", "4");
		skillsdetails.resetskils();
	}
	
	
	@Test(priority=11)
	public void certification() throws InterruptedException
	{
		CoreCertifications empdetail = PageFactory.initElements(driver, CoreCertifications.class);
		
		//empdetail.employeedetails();
		empdetail.certific();
		empdetail.certidropdown("18");
		 empdetail.certificatedatepicker();
		 empdetail.certificateyearselect();
		 empdetail.certificatecomments("Diploma in software testing");
		// empdetail.certsaveBtn();
		 empdetail.certResetBtn();
	}
	
	@Test(priority=12)
	public void currentlocation1() throws InterruptedException
	{
		corecurrentlocation currlocation = PageFactory.initElements(driver, corecurrentlocation.class);
	currlocation.currentmenu();
	 currlocation.currentlocdrop("Client Location");
	 currlocation.locaddress("US");
	currlocation.backprof();
	Thread.sleep(4000);
	currlocation.homeafterlocclick();	
	
}
	
	/*@Test(priority=12)
	public void myskills() throws InterruptedException
	{
		coreMySkills mysk = PageFactory.initElements(driver, coreMySkills.class);
		
		Thread.sleep(3000);
	//    mysk.myskempinfo();
		Thread.sleep(2000);
	    mysk.myskillmenu();
	   Thread.sleep(2000);
	   mysk.myskillsdeatils();
	    mysk.searchdrop("Status", "Pending Approval");
	  mysk.approved("Status", "Approved"); 
	   mysk.reject("Status", "Reject");	*/
		
}
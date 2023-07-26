package smoke_Suite;

import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Processors;
import io.qameta.allure.Description;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Register_Processor;

public class ALC_4354 extends BaseClass {
	
	@Test	
	@Description("Create Processor with already Created Branch")
	public void myTest() throws InterruptedException {
		
		System.out.println("Create Processor with already Created Branch");
		PB_LoginPage l=new PB_LoginPage(pbDriver);
		l.loginRandom(password);
		PB_Register_Processor cbp =new PB_Register_Processor(pbDriver);
	    cbp.createProcessor();
	}
	@Test
	@Description("Search and Edit Processor In Alchmey")
	public void seacrchAndEditProcessorInAlchmey() throws InterruptedException {
		
		System.out.println("Search and Edit Processor In Alchmey");
	    AlchemyLoginPage alp = new AlchemyLoginPage(alcDriver);
		alp.alc_adminlogin(adminphoneNumber, adminpassword);
	    Processors apt = new Processors(alcDriver);
	    System.out.println(phoneNumber);
	    apt.SearchAndEditProcessorInAlchemy(phoneNumber);
	}
	@Test
	@Description("Login In app and Verify")
	public void VerifyInApp() throws InterruptedException {
		
		System.out.println("Login In app and Verify");
	    Thread.sleep(2000);
	    PB_LoginPage l=new PB_LoginPage(pbDriver);
	    l.menu();
	    Thread.sleep(2000);
	    l.logout();
	    l.loginRandom(password);
	}

}

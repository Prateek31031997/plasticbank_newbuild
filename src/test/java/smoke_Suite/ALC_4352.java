package smoke_Suite;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Stores;
import io.qameta.allure.Description;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Menu_Options;
import plastic_Bank_Pages.PB_Register_Store;

public class ALC_4352  extends BaseClass {
	String loginNumber = "+63789654";
	String loginPassword = "password1";
	String business_name ="Buss"+RandomStringUtils.randomAlphabetic(5);
	public String adminphoneNumber="+919560071590";
	public String adminpassword="123456a";
	
	@Test(priority=0)
	@Description("Create a Store and add Item")
	public void createNewStore()throws InterruptedException {
		System.out.println("Create a Store and add Item\");");
		PB_Menu_Options pbMenu= new PB_Menu_Options(pbDriver);
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		PB_Register_Store pbStore = new PB_Register_Store(pbDriver);
		pblogin.permission();
		pblogin.login(loginNumber, loginPassword);
		Thread.sleep(1000);
		pbMenu.clickCreateBusness();
		pbStore.fillBusnessData(business_name);
		pbStore.fillItemsData("Pizza", "100", "250");
		
	}
	
	@Test(priority=1)
	@Description("Login Alchmey")
	public void loginAlchmey() throws InterruptedException {
			
		System.out.println("Login Alchmey");
			AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
			loginAlchmey.alc_adminlogin(adminphoneNumber,adminpassword);
			
		}
	
	@Test(priority=2)
	@Description("Verify edited details in Alchmey")
	public void verifyNewStore()throws InterruptedException {
		
		System.out.println();
		Stores webStore = new Stores(alcDriver);
		webStore.verifyCreatedStore(business_name);
		webStore.editStore_Details("Dheradun");
		
	}
	
	
	
}


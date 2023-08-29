package smoke_Suite;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Branches;
import io.qameta.allure.Description;
import plastic_Bank_Pages.PB_LoginPage;

@Listeners({Utilities.ScreenshotListener.class})
public class ALC_4351 extends BaseClass {

	@Test(priority=0, description = "New branch account is searchable in Alchemy under the 'Members' section")
	@Description("Login Already added Branch")
	public void openRegisterdBranchInApp() throws InterruptedException {
		System.out.println("Login Already added Branch");
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		Thread.sleep(3000);
		pblogin.permission();
		pblogin.loginRandom(password);
	}

	@Test(priority=1, description = "- Data displayed in user will turn into a field that can be edited | -Changes are saved and can be seen in user details")
	@Description("Edit Branch Details NAME")
	public void branchVerifyAndEdit() throws InterruptedException {
		System.out.println("Edit Branch Details Name");
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin(adminphoneNumber,adminpassword);
		Branches alc_branch=new Branches(alcDriver);
		System.out.println("Member Phone number in suspend branch edit "+phoneNumber);
		alc_branch.editBranchNameDetails(phoneNumber);
		Thread.sleep(2000);
	}



	@Test(priority =2, description = "User should see the updated data")
	@Description("Verify Edited Name in Mobile App")
	public void verifyEditInApp() throws InterruptedException {
		System.out.println("Verify Edited Name in Mobile App");
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.logout();
		Thread.sleep(2000);
		pblogin.loginRandom(password);
		pblogin.nameVerify();
		pblogin.logout();
	}

	@Test(priority=3, description = "-A pop up confirmation will appear and ask user if they are sure to suspend the account | - Once confirming, user should have suspend checkbox checked")
	@Description("Suspending the Branch Account")
	public void suspendBranch() throws InterruptedException {
		System.out.println("Suspending the Branch Account");
		Branches alc_branch=new Branches(alcDriver);
		System.out.println("Member Phone number in suspend branch "+phoneNumber);
		alc_branch.suspendBranchAccount("+63"+randomPhoneNumber);

	}

	@Test(priority =4, description = "User should not be able to login because account was suspended")
	@Description("Verify suspend Account in App")
	public void verifySuspendedAccount() throws InterruptedException {
		System.out.println("Verify suspend Account in App");
		PB_LoginPage lp =new PB_LoginPage(pbDriver);
		pbDriver.terminateApp("org.plasticbank.app");
		pbDriver.activateApp("org.plasticbank.app");
		Thread.sleep(20000);
		lp.loginRandom(password);
		lp.suspendAccountBranchVerify();
	}

}
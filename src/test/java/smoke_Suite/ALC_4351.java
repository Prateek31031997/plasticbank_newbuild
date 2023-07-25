package smoke_Suite;

import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Branches;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Register_CollectionPoint;
import plastic_Bank_Pages.PB_Register_Member;

public class ALC_4351 extends BaseClass {

	@Test(priority = 0)
	public void loginAlchmey() throws InterruptedException {
		
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin(adminphoneNumber,adminpassword);
	}

	  @Test(priority=1) public void signUp()throws InterruptedException {
	  
	  PB_Register_Member pbsignup= new PB_Register_Member(pbDriver);
	  //pbsignup.signUp(memberName,randomLastName,password,phoneNumber);
	  pbsignup.signUpRandom(memberName,password);
	  pbsignup.logout();
	  PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
	  pblogin.loginRandom(this.password); Thread.sleep(5000); }
	 
	@Test(priority=2)
	public void branchVerify() throws InterruptedException {
		PB_Register_CollectionPoint branchCreate= new PB_Register_CollectionPoint(pbDriver);
		branchCreate.createBranch();
		Branches alc_branch=new Branches(alcDriver);
		alc_branch.editBranchDetails();
	}
	
}

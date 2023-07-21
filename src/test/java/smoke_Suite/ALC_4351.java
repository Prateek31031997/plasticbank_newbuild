package smoke_Suite;

import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.Branches;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Register_CollectionPoint;
import plastic_Bank_Pages.PB_Register_Member;

public class ALC_4351 extends BaseClass {


	public String name= "Gayas";
	public String lastname= "Gayas";
	public String password= "password1";
	public String branchName="Gayas Branch444";
	public String phoneNumber= "+63"+randomPhoneNumber;
	
	
	@Test(priority=0)
	public void signUp()throws InterruptedException {
		
		PB_Register_Member pbsignup= new PB_Register_Member(pbDriver);
		//pbsignup.signUp(name,lastname,password,phoneNumber);
		pbsignup.signUpRandom(this.name,this.password);
		pbsignup.logout();
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.loginRandom(this.password);
		Thread.sleep(5000);
	}
	@Test(priority=1)
	public void branchVerify() throws InterruptedException {
		PB_Register_CollectionPoint branchCreate= new PB_Register_CollectionPoint(pbDriver);
		branchCreate.createBranch(branchName);
		Branches alc_branch=new Branches(alcDriver);
		alc_branch.editBranchDetails();
	}
	
}

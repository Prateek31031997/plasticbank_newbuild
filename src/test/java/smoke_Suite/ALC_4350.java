package smoke_Suite;

import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Members;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Register_CollectionPoint;
import plastic_Bank_Pages.PB_Register_Member;

//ALC-4350 = In App, Member - Create , new user login, edit, check in Alchemy to confirm new user exists , suspend account

public class ALC_4350 extends BaseClass {
	
	public String memberName= "Gayas";
	public String branchmemberName= "Gayas";
	
	public String password= "password1";
	public String phoneNumber="+63"+randomPhoneNumber;
	public String branchMemberphoneNumber=randomMemberPhoneNumber;
	public String adminphoneNumber="+919560071590";
	public String adminpassword="123456a";
	public String branchName="Gayas "+randomBusinessName;
	
	@Test(priority=0)
	public void signUp()throws InterruptedException {
		
		PB_Register_Member pbsignup= new PB_Register_Member(pbDriver);
		pbsignup.signUpRandom(memberName,password);
		Thread.sleep(3000);
		pbsignup.logout();	
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.loginRandom(phoneNumber,password);
		Thread.sleep(5000);
		
	}	
	
	@Test(priority = 1)
	public void loginAlchmey() throws InterruptedException {
		
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin(adminphoneNumber,adminpassword);
		Members alc_mem =new Members(alcDriver);
		alc_mem.verifyMember(memberName);
	}
	@Test(priority=2)
	public void createBranchAndMember() throws InterruptedException {
		
		PB_Register_CollectionPoint branchCreate=new PB_Register_CollectionPoint(pbDriver);
		branchCreate.createBranch(branchName);
		branchCreate.addMemberToCreatedBranch(branchmemberName,branchMemberphoneNumber);
		Thread.sleep(5000);
		PB_Register_Member pbRegMem=new PB_Register_Member(pbDriver);
		pbRegMem.logout();		
	}
	@Test(priority=3)
	public void EditMemberDetails() {
		Members mem=new Members(alcDriver);
		mem.editMemberDetails();
	}
	@Test(priority=4)
	public void loginBranchMemberPB() throws InterruptedException {
		PB_LoginPage lp =new PB_LoginPage(pbDriver);
		lp.login(branchMemberphoneNumber, password);
		Thread.sleep(3000);
		PB_Register_Member pbRegMem=new PB_Register_Member(pbDriver);
		pbRegMem.logout();
	}
	@Test(priority=5)
	public void suspendMemberALC() {
		Members mem=new Members(alcDriver);
		mem.suspendMember();
	}
	@Test(priority=6)
	public void memberSuspendVerify() {
		PB_Register_Member pbRegMem=new PB_Register_Member(pbDriver);
		pbRegMem.logout();
		PB_LoginPage lp =new PB_LoginPage(pbDriver);
		lp.login(branchMemberphoneNumber,password);
		
	}
}

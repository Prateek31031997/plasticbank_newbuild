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
	
	
	
	@Test(priority=0)
	public void signUp()throws InterruptedException {
		
		PB_Register_Member pbsignup= new PB_Register_Member(pbDriver);
		pbsignup.signUpRandom(memberName,password);
		Thread.sleep(3000);
		pbsignup.logout();	
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.loginRandom(password);
		Thread.sleep(5000);
		
	}	
	
	@Test(priority = 1)
	public void loginAlchmey() throws InterruptedException {
		
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin(adminphoneNumber,adminpassword);
		Thread.sleep(3000);
		
	}
	@Test(priority =2)
	public void VerifyMemberAlchmey() throws InterruptedException {
		Members alc_mem =new Members(alcDriver);
		alc_mem.selectAndverifyMember(phoneNumber);
		Thread.sleep(5000);
	}
	//{"VerifyMemberAlchmey"}
	@Test(priority =3 )
	public void createBranchAndMember() throws InterruptedException {
		
		PB_Register_CollectionPoint branchCreate=new PB_Register_CollectionPoint(pbDriver);
		branchCreate.createBranch();
		branchCreate.addMemberToCreatedBranch();
		Thread.sleep(5000);
		PB_Register_Member pbRegMem=new PB_Register_Member(pbDriver);
		pbRegMem.logout();		
	}
	
	@Test(priority=4)
	public void EditMemberDetails() throws InterruptedException {
		Members mem=new Members(alcDriver);
		mem.editMemberDetails(branchMemberphoneNumber);
	}
	@Test(priority=5)
	public void loginBranchMemberPB() throws InterruptedException {
		PB_LoginPage lp =new PB_LoginPage(pbDriver);
		lp.login(branchMemberphoneNumber, password);
		Thread.sleep(5000);
		PB_Register_Member pbRegMem=new PB_Register_Member(pbDriver);
		pbRegMem.logout();
	}
	@Test(priority=6)
	public void suspendMemberALC() throws InterruptedException {
		Members mem=new Members(alcDriver);
		System.out.println("Suspending this member "+branchMemberphoneNumber);
		mem.suspendMember(branchMemberphoneNumber);
		Thread.sleep(4000);
	}
	@Test(priority=7)
	public void memberSuspendVerify() {
		/*
		 * PB_Register_Member pbRegMem=new PB_Register_Member(pbDriver);
		 * pbRegMem.logout();
		 */
		PB_LoginPage lp =new PB_LoginPage(pbDriver);
		lp.login(branchMemberphoneNumber,password);
		lp.oK();	
	}
	@Test(priority=8)
	public void branchSuspendMemberVerification() throws InterruptedException {
	
		Thread.sleep(3000);
		PB_LoginPage lp = new PB_LoginPage(pbDriver);
		lp.loginRandom(password);
		Thread.sleep(2000);
		lp.clickSuspendedMemebr();
		lp.oK();
		
	}
}

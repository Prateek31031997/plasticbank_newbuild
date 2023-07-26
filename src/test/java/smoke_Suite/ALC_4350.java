package smoke_Suite;

import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Members;
import io.qameta.allure.Description;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Register_CollectionPoint;
import plastic_Bank_Pages.PB_Register_Member;

//ALC-4350 = In App, Member - Create , new user login, edit, check in Alchemy to confirm new user exists , suspend account

@Listeners({AllureTestNg.class})
public class ALC_4350 extends BaseClass {
	
	
	
	@Test(priority=0)
	@Description("Signing up a member and Login Verification and Logout")
	public void signUp()throws InterruptedException {
		
		System.out.println("Signing up a member and Login Verification and Logout");
		PB_Register_Member pbsignup= new PB_Register_Member(pbDriver);
		pbsignup.signUpRandom(memberName,password);
		Thread.sleep(3000);
		pbsignup.logout();	
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.loginRandom(password);
		Thread.sleep(5000);
		
	}	
	
	@Test(priority = 1)
	@Description("Alchmey Login")
	public void loginAlchmey() throws InterruptedException {
		
		System.out.println("Alchmey Login");
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin(adminphoneNumber,adminpassword);
		Thread.sleep(3000);
		
	}
	@Test(priority =2)
	@Description("Verification of member in Alchmey")
	public void VerifyMemberAlchmey() throws InterruptedException {
		System.out.println("Verification of member in Alchmey");
		
		Members alc_mem =new Members(alcDriver);
		alc_mem.selectAndverifyMember(phoneNumber);
		Thread.sleep(5000);
	}
	
	@Test(priority =3 )
	@Description("Add Branch and Create Member and LogOut")
	public void createBranchAndMember() throws InterruptedException {
		System.out.println("Add Branch and Create Member and LogOut");
		PB_Register_CollectionPoint branchCreate=new PB_Register_CollectionPoint(pbDriver);
		branchCreate.createBranch();
		branchCreate.addMemberToCreatedBranch();
		Thread.sleep(5000);
		PB_Register_Member pbRegMem=new PB_Register_Member(pbDriver);
		pbRegMem.logout();		
	}
	
	@Test(priority=4)
	@Description("Edit the branch member details in Alchmey")
	public void EditMemberDetails() throws InterruptedException {
		System.out.println("Edit the branch member details in Alchmey");
		Members mem=new Members(alcDriver);
		mem.editMemberDetails(branchMemberphoneNumber,"Gayas Khan");
	}
	@Test(priority=5)
	@Description("Login in App with Branch Member Details")
	public void loginBranchMemberPB() throws InterruptedException {
		System.out.println("Login in App with Branch Member Details");
		PB_LoginPage lp =new PB_LoginPage(pbDriver);
		lp.login(branchMemberphoneNumber, password);
		Thread.sleep(5000);
		PB_Register_Member pbRegMem=new PB_Register_Member(pbDriver);
		pbRegMem.logout();
	}
	@Test(priority=6)
	@Description("Suspend Member in Alchmey")
	public void suspendMemberALC() throws InterruptedException {
		System.out.println("Suspend Member in Alchmey");
		Members mem=new Members(alcDriver);
		System.out.println("Suspending this member "+branchMemberphoneNumber);
		mem.suspendMember(branchMemberphoneNumber);
		Thread.sleep(4000);
	}
	@Test(priority=7)
	@Description("Login in Mobile app with Suspended Member details")
	public void memberSuspendVerify() {
		
		System.out.println("Login in Mobile app with Suspended Member details");
		PB_LoginPage lp =new PB_LoginPage(pbDriver);
		lp.login(branchMemberphoneNumber,password);
		lp.oK();	
	}
	@Test(priority=8)
	@Description("Verify Suspended member By Branch Login")
	public void branchSuspendMemberVerification() throws InterruptedException {
	
		System.out.println("Verify Suspended member By Branch Login");
		Thread.sleep(3000);
		PB_LoginPage lp = new PB_LoginPage(pbDriver);
		lp.loginRandom(password);
		Thread.sleep(2000);
		lp.clickSuspendedMemebr();
		lp.oK();
		
	}
}

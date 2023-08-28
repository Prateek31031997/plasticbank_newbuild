package smoke_Suite;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Bonus;
import alchemy_Pages.Branches;
import alchemy_Pages.Orders;
import alchemy_Pages.Plastic_Chain;
import alchemy_Pages.Processors;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Transaction;

@Listeners({AllureTestNg.class})

public class ALC_4357 extends BaseClass {
	
	
	@Test(priority =0,enabled=false)
	@Description("abc")
	public void member_Branch1_Transaction_KG_Bonus_App_Assertion() throws InterruptedException {
		
		PB_Transaction t1=new PB_Transaction(pbDriver);
		PB_LoginPage lo =new PB_LoginPage(pbDriver);
		lo.login(branch1_Number, password);
		t1.m1toB1(member_Number);
		lo.logout();
		
	}
	@Test(priority =1,enabled=false)
	@Description("def")
	public void member_Branch1_Transaction_KG_Bonus_Alchmey_Assertion() throws InterruptedException {
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin(adminphoneNumber,adminpassword);
		Thread.sleep(3000);
		Branches br = new Branches(alcDriver);
		br.firstTransactionApproveExcHisB1(branch1_Number);
		Thread.sleep(1000);
		Orders odr = new Orders(alcDriver);
		odr.bonusCheckPoints(bonusName);
		odr.bonusExchangeHistoryCheckPoint();
		System.out.println("--------");
		Bonus bon = new Bonus(alcDriver);
		bon.bounusTransaction1ValueVerify();
		
	}
	
	@Test(priority =2,enabled=false)
	@Description("ghi")
	public void Branch1_Branch2_Transaction_App_Assertions() throws InterruptedException {
		
		PB_Transaction t2=new PB_Transaction(pbDriver);
		PB_LoginPage lo =new PB_LoginPage(pbDriver);
		lo.login(branch2_Number, password);
		t2.b1toB2(branch1_Number);
		lo.logout();
	}
	
	
	
	@Test(priority =3,enabled=false)
	@Description("egr")
	public void Branch1_Branch3_Transaction() throws InterruptedException {
		
		PB_Transaction t3=new PB_Transaction(pbDriver);
		PB_LoginPage lo =new PB_LoginPage(pbDriver);
		lo.login(branch3_Number, password);
		t3.b1toB3(branch1_Number);
		lo.logout();
		
	}
	
	@Test(priority =4,enabled=false)
	@Description("")
	public void Branch2_Processor_Transaction() throws InterruptedException {
		PB_Transaction t4=new PB_Transaction(pbDriver);
		PB_LoginPage lo =new PB_LoginPage(pbDriver);
		lo.login(processor_Number, password);
		t4.b2ToP(branch2_Number);
		lo.logout();
	
	}
	
	@Test(priority =5,enabled=false)
	@Description("")
	public void Branch3_Processor_Transaction() throws InterruptedException {
		
		PB_Transaction t5=new PB_Transaction(pbDriver);
		PB_LoginPage lo =new PB_LoginPage(pbDriver);
		lo.login(processor_Number, password);
		t5.b3ToP(branch3_Number);
		lo.logout();
		
	}
	
	
	@Test(priority =6,enabled=false)
	@Description("")
	public void Verify_Bonus_Branch1() throws InterruptedException {
		alcDriver.navigate().refresh();
		
		try {
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin(adminphoneNumber,adminpassword);
		Thread.sleep(3000);}
		catch(Exception e) {}
		Branches br1= new Branches(alcDriver);
		br1.transactionApproveExcHisB1(branch1_Number);
		
	}
	
	@Test(priority =7,enabled=false)
	@Description("")
	public void Verify_Bonus_Branch2() throws InterruptedException {
		
		Thread.sleep(3000);
		Branches br2= new Branches(alcDriver);
		br2.transactionApproveExcHisB2(branch2_Number);
	}
	
	@Test(priority =8,enabled=false)
	@Description("")
	public void Verify_Bonus_Branch3() throws InterruptedException {
		
		
		Branches br3= new Branches(alcDriver);
		br3.transactionApproveExcHisB3(branch3_Number);
	}
	
	@Test(priority =9,enabled=false)
	@Description("")
	public void Verify_Bonus_Processor() throws InterruptedException {
		
		
		Processors p1= new Processors(alcDriver);
		p1.transactionApproveExcHisP1(processor_Number);
	}
	
	@Test(priority =10,enabled=false)
	@Description("")
	public void Plastic_Chain_Before_Approval() throws InterruptedException {
		
		
		Plastic_Chain pc1= new Plastic_Chain(alcDriver);
		pc1.plastic_ChainVerificationBefore(bonusName);
	}
	
	@Test(priority =11)
	@Description("")
	public void VerifyBonusOrderRecieptBranchAssertions() throws InterruptedException {
		
		Bonus b1=new Bonus(alcDriver);
		b1.bonusBranch1Verification();
		b1.bonusBranch2Verification();
		b1.bonusBranch3Verification();
		
		
	}
	
	@Test(priority =12,enabled=true)
	@Description("This Test Case redirects to bonus ")
	public void VerifyBonusOrderBranchValueAssertions() throws InterruptedException {
		
		
		Bonus b2=new Bonus(alcDriver);
		b2.bonusBranch1ValueVerification();
		b2.bonusBranch2ValueVerification();
		b2.bonusBranch3ValueVerification();
		b2.processor1ValueVerification();
	
	}
	
	@Test(priority =13,enabled=false)
	@Description("Plastic Chain is Verified here that contains Assertion of all the transactions lists and the presence of all the Green Arrows ")
	public void Plastic_Chain_After_Approval() throws InterruptedException {

		Plastic_Chain pc2= new Plastic_Chain(alcDriver);
		pc2.plastic_ChainVerificationAfter(bonusName);
	}
}

package smoke_Suite;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import plastic_Bank_Pages.PB_Transaction;

@Listeners({AllureTestNg.class})

public class ALC_4357 extends BaseClass {
	
	public String member_Name="";
	public String branch1_Name="";
	public String branch2_Name="";
	public String branch3_Name="";
	public String processor_Name="";
	public String member_Number="";
	public String branch1_Number="";
	public String branch2_Number="";
	public String branch3_Number="";
	public String processor_Number="";
	
	
	@Test
	@Description("")
	public void member_Branch1_Transaction() {
		PB_Transaction t1=new PB_Transaction(pbDriver);
		
		
	}
	
	@Test
	@Description("")
	public void Branch1_Branch2_Transaction() {
		
	}
	
	@Test
	@Description("")
	public void Branch1_Branch3_Transaction() {
		
	}
	
	@Test
	@Description("")
	public void Branch2_Processor_Transaction() {
		
	}
	
	@Test
	@Description("")
	public void Branch3_Processor_Transaction() {
		
	}
	
	@Test
	@Description("")
	public void Verify_Bonus_KG_M_B1() {
		
	}
	
	@Test
	@Description("")
	public void Verify_Bonus_KG_B1_B2() {
		
	}
	
	@Test
	@Description("")
	public void Verify_Bonus_KG_B1_B3() {
		
	}
	
	@Test
	@Description("")
	public void Verify_Bonus_KG_B2_P() {
		
	}
	
	@Test
	@Description("")
	public void Verify_Bonus_KG_B3_P() {
		
	}
	
	@Test
	@Description("")
	public void VerifyTransactionsApproved_B1() {
		
	}
	
	@Test
	@Description("")
	public void VerifyTransactionsApproved_B2() {
		
	}
	@Test
	@Description("")
	public void VerifyTransactionsApproved_B3() {
		
	}
	
	
}

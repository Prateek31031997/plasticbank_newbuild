package smoke_Suite;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.Branches;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import plastic_Bank_Pages.PB_Transaction;

@Listeners({AllureTestNg.class})

public class ALC_4357 extends BaseClass {
	
	public String member_Name="gayasMember1";
	public String branch1_Name="gayasBranch1";
	public String branch2_Name="gayasBranch2";
	public String branch3_Name="gayasBranch3";
	public String processor_Name="gayasProcessor1";
	public String member_Number="+6311111111";
	public String branch1_Number="+6322222222";
	public String branch2_Number="+6333333333";
	public String branch3_Number="+6344444444";
	public String processor_Number="+6355555555";

	
	@Test
	@Description("")
	public void member_Branch1_Transaction() throws InterruptedException {
		PB_Transaction t1=new PB_Transaction(pbDriver);
		t1.doTransaction(member_Number,hdpe_M_B1,pet_M_B1);
		
		
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
	public void VerifyTransactionsApproved_B1() throws InterruptedException {
		Branches br =new Branches(pbDriver);
		br.verifyTransactionApproved(branch1_Number);
		
	}
	
	@Test
	@Description("")
	public void VerifyTransactionsApproved_B2() throws InterruptedException {
		
		Branches br2 =new Branches(pbDriver);
		br2.verifyTransactionApproved(branch2_Number);
		
		
	}
	@Test
	@Description("")
	public void VerifyTransactionsApproved_B3() throws InterruptedException {
		
		Branches br3 =new Branches(pbDriver);
		br3.verifyTransactionApproved(branch3_Number);
	}
	
	@Test
	@Description("")
	public void VerifyTransactionsApproved_Processor() throws InterruptedException {
		
		Branches pr =new Branches(pbDriver);
		pr.verifyTransactionApproved(processor_Number);
	}
}

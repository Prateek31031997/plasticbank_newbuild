package smoke_Suite;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.Bonus;
import alchemy_Pages.Branches;
import io.qameta.allure.Description;

public class ALC_4363 extends BaseClass{

	@Test(priority =0,enabled=true, description = "Approve_transactions_branch_exchange_history_Verify_In_BonusApproval")
	@Description("Approve_transactions_branch_exchange_history_Verify_In_BonusApproval")	
	public void  Approve_transactions_branch_exchange_history_Verify_In_BonusApproval() throws IOException, InterruptedException {
		
		Branches br1 = new Branches(alcDriver);
		Bonus bn1 =new Bonus(alcDriver);
		bn1.bonusApproval(bonusName);
		br1.verifyBonusInBranchExcHistory(branch1_Number);
		

}
}

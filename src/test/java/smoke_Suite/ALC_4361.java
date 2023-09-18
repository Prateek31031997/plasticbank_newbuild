package smoke_Suite;


import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utilities.BaseClass;
import Utilities.Data;
import Utilities.ScreenshotListener;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Register_CollectionPoint;
import plastic_Bank_Pages.PB_Transaction;

@Listeners({AllureTestNg.class, ScreenshotListener.class})
public class ALC_4361 extends BaseClass{

	@Test(priority =1, description="Create data for testcase ALC_4361")
	@Description("Create data for testcase ALC_4361")
public void createdata() throws IOException {
	Data dt = new Data();
		dt.runNewmanFor_ALC_4361();
	}
	@Test(priority =2, description="Add donation item to branch and processor")
	@Description("Add donation item to branch and processor")
	public void addDonations() throws InterruptedException {
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.login(Data.values_ALC_4361.get(2), password);
		PB_Register_CollectionPoint prc = new PB_Register_CollectionPoint(pbDriver);
		prc.addDonation();
		PB_LoginPage pblogin1 = new PB_LoginPage(pbDriver);
		pblogin1.login(Data.values_ALC_4361.get(4), password);
		PB_Register_CollectionPoint prc1 = new PB_Register_CollectionPoint(pbDriver);
		prc1.goToProcessor();
		prc1.addDonation();
	}
	@Test(priority=3, description="Perform transactions between member, branch and processor")
	@Description("Perform transactions between member, branch and processor")
	public void doTransactions() throws InterruptedException {
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.login(Data.values_ALC_4361.get(2), password);
		PB_Transaction pbt = new PB_Transaction(pbDriver);
		pbt.memberToBranchDonation(Data.values_ALC_4361.get(1));
		PB_LoginPage pblogin1 = new PB_LoginPage(pbDriver);
		pblogin1.login(Data.values_ALC_4361.get(4), password);
		PB_Transaction pbt1 = new PB_Transaction(pbDriver);
		pbt1.branchToProcessorDonation(Data.values_ALC_4361.get(2));
}
	@Test(priority=4, description="Verify that no bonus is received for donation")
	@Description("Verify that  no bonus is received for donation")
	public void verifyNoBonusForDonations() throws InterruptedException {
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.login(Data.values_ALC_4361.get(2), password);
		PB_Transaction pbt = new PB_Transaction(pbDriver);
		pbt.verifyNoBonusForDonation();
	}
	
	
	
}